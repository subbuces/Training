require "rspec"
require "rubygems"
require "selenium-webdriver"
require "eyes_selenium"

RSpec_describe 'helloworldtestrspec_classic' do
  puts "Started"

  it 'test 2' do
    puts "spec method 2"
  end

  puts " End"
  #  it 'Test Login and Logout functionality' do
  #    visual_grid_runner = Applitools::Selenium::VisualGridRunner.new(10)
  #    eyes = Applitools::Selenium::Eyes.new(runner: visual_grid_runner)
  #    eyes.api_key = 'bgdu6CiipGD4o8QxzJs9EWXkjL3eoZxsQta102I1Xoq2g110'
  #    web_driver = Selenium::WebDriver.for :firefox
  #      test_config = eys.get_configuration
  #      test_config.test_name = "Login and Logout"
  #      eyes.set_configuration(test_config)
  #      web_driver = eyes.open(driver: web_driver)
  #      eyes.check_window('Application landing screen')
  #      web_driver.find_element(:class, 'last').click
  #      sleep 3
  #      eyes.check('Email Page',Applitools::Selenium::Target.window.fully)
  #      web_driver.find_element(:name, 'email').displayed?
  #      web_driver.find_element(:name, 'email').send_keys 'subbarao.paritala@cesltd.com'
  #      sleep 3
  #      web_driver.find_element(:css, 'html.history.no-touchevents.localstorage body.centered div#page-region div.section.last div.sub-section.narrow div#main-region div div.js-step-region div div.box.text-left div.pbl form.js-form input.button.js-loading-hide').click
  #      sleep 3
  #      eyes.check('Password Page',Applitools::Selenium::Target.window.fully)
  #      web_driver.find_element(:name, 'password').send_keys 'India@2020'
  #      web_driver.find_element(:xpath, '//*[@id="main-region"]//form/input').displayed?
  #      web_driver.find_element(:xpath, '//*[@id="main-region"]//form/input').click
  #      sleep 5
  #      puts "Loggedinto the application"
  #      eyes.check('Dashboard Page',Applitools::Selenium::Target.window.fully)
  #    end

end