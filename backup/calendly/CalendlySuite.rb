require "rspec"
require "rubygems"
require "selenium-webdriver"
require "eyes_selenium"

RSpecdescribe 'CalendyTestSpec_Smoke' do
  before(:context) do
    @runner ||= Applitools::ClassicRunner.new
    @suite_config = Applitools::Selenium::Configuration.new.tap do |c|
      #    Checkpoint Configuration
      c.force_full_page_screenshot = true
      c.stitch_mode = Applitools::Selenium::StitchMode::CSS
      c.hide_scrolbars = false
      c.hide_caret = true

      #    Test Suite Configurations
      c.viewport_size = Applitools:RectangleSize.from_any_argument(width: 1000, height: 1000)
      c.api_key = ENV['APPLITOOLS_API_KEY']
      c.server_url = 'https://eyes.applitools.com/'
      c.app_name = 'Calendy : App for all your Events'
      c.batch_info = Applitools::BatchInfo.new('Calendy - LogIn/Out test cases')
    end
  end

  let(:runner){@runner}
  let(:configuration){@suite_config}
  let(:web_driver){Selenium::WebDriver.for :firefox}
  let(:eyes)do
    Applitools::Selenium::Eyes.new(runer: runner).tap do |e|
      e.set_configuration(configuration)
    end
  end

  
  it 'Test Login and Logout functionality' do
    test_config = eys.get_configuration
    test_config.test_name = "Login and Logout"
    eyes.set_configuration(test_config)

    driver = eyes.open(driver: web_driver)

    #Visual checkpoint - 1
    driver.get('https://calendly.com/')
    eyes.check_window('Application landing screen')
    #  ----------------
    web_driver.find_element(:class, 'last').click
    sleep 3
    eyes.check('Email Page',Applitools::Selenium::Target.window.fully)
    web_driver.find_element(:name, 'email').displayed?
    web_driver.find_element(:name, 'email').send_keys 'subbarao.paritala@cesltd.com'
    sleep 3
    web_driver.find_element(:css, 'html.history.no-touchevents.localstorage body.centered div#page-region div.section.last div.sub-section.narrow div#main-region div div.js-step-region div div.box.text-left div.pbl form.js-form input.button.js-loading-hide').click
    sleep 3
    eyes.check('Password Page',Applitools::Selenium::Target.window.fully)
    web_driver.find_element(:name, 'password').send_keys 'India@2020'
    web_driver.find_element(:xpath, '//*[@id="main-region"]//form/input').displayed?
    web_driver.find_element(:xpath, '//*[@id="main-region"]//form/input').click
    sleep 5
    puts "Loggedinto the application"
    eyes.check('Dashboard Page',Applitools::Selenium::Target.window.fully)
    #  ----------------
  end

  after(:each) do |example|
    if example.exception
      eyes.abort_async
    else
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
         "TestName = #{r.original_results['name']},"\
         "Browser = #{r.original_results['hostApp']},"\
         "OS = #{r.original_results['hostOS']},"\
         "viewport = #{r.original_results['hostDisplaySize']['width']} x #{r.orinal_results['hostDisplaysize']['height']},"\
         "matched = #{r.matches},"
  end
end

