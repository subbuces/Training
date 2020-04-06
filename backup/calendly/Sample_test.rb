require 'eyes_selenium'

visual_grid_runner = Applitools::Selenium::VisualGridRunner.new(10)
eyes = Applitools::Selenium::Eyes.new(runner: visual_grid_runner)
eyes.api_key = 'bgdu6CiipGD4o8QxzJs9EWXkjL3eoZxsQta102I1Xoq2g110'
eyes.force_fullpage_screenshot = true
web_driver = Selenium::WebDriver.for :firefox

eyes.configure do |conf|
  conf.app_name = 'Cal App'
  conf.test_name = 'Smoke Test - cal 1'
  # conf.proxy = Applitools::Connectivity::Proxy.new('http://your.proxy.com')
  conf.viewport_size = Applitools::RectangleSize.new(800, 600)
  conf.add_browser(800, 600, BrowserTypes::CHROME)
#  conf.add_browser(1600, 1200, BrowserTypes::FIREFOX)
#  conf.add_browser(800,600, BrowserTypes::SAFARI)
#  conf.add_browser(800,600, BrowserTypes::IE_10)
#  conf.add_browser(800,600, BrowserTypes::IE_11)
#  conf.add_browser(800,600, BrowserTypes::EDGE)
#  conf.add_device_emulation(Devices::IPhone678)
#  conf.add_device_emulation(Devices::MicrosoftLumia950, Orientations::LANDSCAPE)
end

begin
  # Call Open on eyes to initialize a test session
  driver = eyes.open(driver: web_driver)

  # Navigate to the url we want to test
#  driver.get('https://demo.applitools.com/index.html')
#  driver.get('https://demo.applitools.com/index_v2.html')
  driver.get('https://calendly.com/')
  # Note to see visual bugs, run the test using the above URL for the 1st run.
  # but then change the above URL to https://demo.applitools.com/index_v2.html (for the 2nd run)

  # check the login page
  eyes.check('Main page', Applitools::Selenium::Target.window.fully)

  # Click the 'Log In' button
#  driver.find_element(:id, 'log-in').click
  sleep 3
  driver.find_element(:xpath, '//*[@id="page-region"]/div[2]/div[1]/div/ul/li[7]/a').click

  # Check the app page
  eyes.check('Email -Login Page', Applitools::Selenium::Target.window.fully)
  web_driver.find_element(:name, 'email').send_keys 'subbarao.paritala@cesltd.com'
  sleep 3
  web_driver.find_element(:xpath, '//*[@id="main-region"]/div/div[1]/div/div/div/form/input').click
  
  sleep 4
  eyes.check('Password -Login Page', Applitools::Selenium::Target.window.fully)
  web_driver.find_element(:name, 'password').send_keys 'India@2020'
  sleep 3
  web_driver.find_element(:xpath, '//*[@id="main-region"]//form/input').click
  sleep 3
  web_driver.find_element(:xpath, '//*[@id="main-region"]//nav/div/button[1]/div')
  eyes.check('My Calendly home Page', Applitools::Selenium::Target.window.fully)

  eyes.close_async
rescue => e
  puts e.message
  # If the test was aborted before eyes.close / eyes.close_async was called, ends the test as aborted.
  eyes.abort_async
ensure
  # Close the browser
  driver.quit
  results = visual_grid_runner.get_all_test_results
  puts results
end
