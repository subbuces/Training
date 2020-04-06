require 'selenium-webdriver'

Before do
  @driver = Selenium::WebDriver.for :firefox
  @driver.manage.window.maximize
end

After do
  @driver.quits
end