require "rubygems"
require "selenium-webdriver"
#Launch firefox browser
driver = Selenium::WebDriver.for :firefox
driver.navigate.to "https://calendly.com/"
sleep 5
driver.find_element(:class, 'last').click
sleep 3
driver.find_element(:name, 'email').displayed?
driver.find_element(:name, 'email').send_keys 'subbarao.paritala@cesltd.com'
sleep 3
driver.find_element(:css, 'html.history.no-touchevents.localstorage body.centered div#page-region div.section.last div.sub-section.narrow div#main-region div div.js-step-region div div.box.text-left div.pbl form.js-form input.button.js-loading-hide').click
sleep 3
driver.find_element(:name, 'password').send_keys 'India@2020'
driver.find_element(:xpath, '//*[@id="main-region"]//form/input').displayed?
driver.find_element(:xpath, '//*[@id="main-region"]//form/input').click
sleep 5
puts "Loggedinto the application"
driver.find_element(:xpath, '//*[@id="root"]/div[1]/div/div/div[2]/button/div[2]/span').click
#//*[@id="root"]//button/div[2]/span
sleep 2
driver.find_element(:xpath, '//*[@id="root"]//ul[2]/li/a').click