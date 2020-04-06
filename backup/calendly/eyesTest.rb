require 'rspec'
require 'eyes_selenium'

RSpec.describe 'helloworldtestrspec_classic' do
  before(:context) do
    @runner ||= Applitools::ClassicRunner.new  
    @suite_config = Applitools::Selenium::Configuration.new.tap do |c|
      # Checkpoint configuration
      c.force_full_page_screenshot = true
      c.stitch_mode = Applitools::Selenium::StitchModes::CSS
      c.hide_scrollbars = true
      c.hide_caret = true
      # Test suite configurations
      c.viewport_size = Applitools::RectangleSize.from_any_argument(width: 800, height: 600)
      c.api_key = ENV['MY_APPLITOOLS_API_KEY']
      c.server_url = 'https://eyes.applitools.com/'
      c.app_name = 'EKB Example : classic app'
      c.batch_info = Applitools::BatchInfo.new('EKB Example : classic')
      # ... more configurations
    end
  end

  let(:runner) { @runner }
  let(:configuration) { @suite_config }
  let(:web_driver) { Selenium::WebDriver.for :chrome }
  let(:eyes) do
    Applitools::Selenium::Eyes.new(runner: runner).tap do |e|
      e.set_configuration(configuration)
    end
  end


  it 'testHelloWorld' do
    test_config = eyes.get_configuration
    test_config.test_name = 'Hello World test'
    eyes.set_configuration(test_config)
    
    #Open Eyes, the application,test name and viewport size are allready configured
    driver = eyes.open(driver: web_driver)
    
    # Now run the test

    # Visual checkpoint #1.
    driver.get('https:#applitools.com/helloworld')
    eyes.check_window('Before mouse click')

    # Now run the test
    driver.find_element(:tag_name, 'button').click
    eyes.check_window('After mouse click')
  end

  after(:each) do |example|
  # check if an exception was thrown
    if example.exception
      # There was an exception so the test may be incomplete - abort the test
      eyes.abort_async
    else
      # Close the Eyes instance, no need to wait for results, we'll get those at the end in afterTestSuite
      eyes.close_async
    end 
    web_driver.quit
  end

  after(:context) do
    all_test_results = @runner.get_all_test_results(false)
    all_test_results.each do |results|
        handle_test_results(results)
    end
  end
end

def handle_test_results(r)
    unless r 
        puts "No test results information available"
    else
        puts "URL = #{r.url},"\
            "AppName = #{r.original_results['appName']},"\
            "Testname = #{r.original_results['name']}," \
            "Browser = #{r.original_results['hostApp']},"\
            "OS = #{r.original_results['hostOS']}," \
            "viewport = #{r.original_results['hostDisplaySize']['width']} x #{r.original_results['hostDisplaySize']['height']},"\
            "matched = #{r.matches},"\
            "mismatched = #{r.mismatches},"\
            "missing = #{r.missing},"\
            "aborted = #{r.aborted? ? true : false}"
   end
end