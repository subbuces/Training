require "rubygems"
require "Selenium-webdriver"

driver = Selenium::WebDriver.for :firefox
driver.navigate.to "https://calendly.com/"
puts "Calendly is loaded in firefox browser"