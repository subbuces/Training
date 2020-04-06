require "rubygems"
require "selenium-webdriver"
require 'eyes_selenium'

visual_grid_runner = Applitools::Selenium::VisualGridRunner.new(10)
eyes = Applitools::Selenium::Eyes.new(runner: visual_grid_runner)
eyes.api_key = 'bgdu6CiipGD4o8QxzJs9EWXkjL3eoZxsQta102I1Xoq2g110'

#Launch firefox browser
web_driver = Selenium::WebDriver.for :firefox

eyes.configure do |conf|
  conf.app_name = 'Calendly 1'
  conf.test_name = 'Visual Test 1'
  conf.viewport_size = Applitools::RectangleSize.new(1366, 768)
  conf.add_browser(800, 600, BrowserTypes::FIREFOX)
  conf.add_browser(800, 600, BrowserTypes::IE_11)
  conf.api_key = 'bgdu6CiipGD4o8QxzJs9EWXkjL3eoZxsQta102I1Xoq2g110'
  conf.api_key = ENV['APPLITOOLS_API_KEY'] 
  conf.batch_info = Applitools::BatchInfo.new('Calendly Smoke Test')
end

begin
  web_driver = eyes.open(driver: web_driver)
  web_driver.get('https://calendly.com/')
  eyes.check('Login Page',Applitools::Selenium::Target.window.fully)
  eyes.check_window('Login page')
  web_driver.find_element(:class, 'last').click
  sleep 3
  eyes.check('Email Page',Applitools::Selenium::Target.window.fully)
  eyes.check_window('Email page')
  web_driver.find_element(:name, 'email').displayed?
  web_driver.find_element(:name, 'email').send_keys 'subbarao.paritala@cesltd.com'
  sleep 3
  web_driver.find_element(:css, 'html.history.no-touchevents.localstorage body.centered div#page-region div.section.last div.sub-section.narrow div#main-region div div.js-step-region div div.box.text-left div.pbl form.js-form input.button.js-loading-hide').click
  sleep 3
  eyes.check('Password Page',Applitools::Selenium::Target.window.fully)
  eyes.check_window('Password page')
  web_driver.find_element(:name, 'password').send_keys 'India@2020'
  web_driver.find_element(:xpath, '//*[@id="main-region"]//form/input').displayed?
  web_driver.find_element(:xpath, '//*[@id="main-region"]//form/input').click
  sleep 5
  puts "Loggedinto the application"
  eyes.check('Dashboard Page',Applitools::Selenium::Target.window.fully)
  eyes.check_window('Dashboard page')
  web_driver.find_element(:xpath, '//*[@id="root"]/div[1]/div/div/div[2]/button/div[2]/span').click
  #//*[@id="root"]//button/div[2]/span
  sleep 2
  web_driver.find_element(:xpath, '//*[@id="root"]//ul[2]/li/a').click
  eyes.check('Dashboard Page',Applitools::Selenium::Target.window.fully)
  eyes.check_window('Dashboard page')
  eyes.close_async
rescue => e
  puts e.message
  eyes.close
  eyes.abort_async
 ensure
  web_driver.quit
   results = visual_grid_runner.get_all_test_results
   puts results
end

