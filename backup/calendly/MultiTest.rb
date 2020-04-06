require 'eyes_selenium'
require 'RSpec'

RSpec.configure { |c| c.expose_dsl_globally = true }
config.expose_dsl_globally = true
  
describe 'Multi scripts' do
  
  before(:each) do |example|
    @browser = Selenium::WebDriver.for :firefox
    @eyes = Applitools::Eyes.new
    @eyes.api_key = ENV['APPLITOOLS_API_KEY']
    @eyes.match_level = 'Layout2'
    @driver = @eyes.open(app_name: '1Calendly', test_name: example.full_description, driver: @browser)
  end
  
  after(:each) do
    @eyes.close
    @browser.quit
  end
  
  it 'Login Page' do
    @driver.get 'https://calendly.com/'
    @eyes.check_window()
    @eyes.check('Login Page', Applitools::Selenium::Target.window.fully)
  end
  
end
