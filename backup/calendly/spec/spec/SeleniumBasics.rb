require "rubygems"
require "selenium-webdriver"

driver = Selenium::WebDriver.for :firefox
driver.manage.window.maximize
driver.get "https://calendly.com/"
#Implicit wait
#driver.manage.timeouts.implicit_wait = 10
#Explicit wait
wait = Selenium::WebDriver::Wait.new(:timeout =>5)
wait.until {driver.find_element(:class, 'last')}
driver.find_element(:class, 'last').click
puts "test started"
#driver.find_element(:name, 'email').displayed?
sleep 3
wait.until {driver.find_element(:name, 'email')}
driver.find_element(:name, 'email').send_keys 'subbarao.paritala@cesltd.com'
sleep 3
driver.find_element(:css, 'html.history.no-touchevents.localstorage body.centered div#page-region div.section.last div.sub-section.narrow div#main-region div div.js-step-region div div.box.text-left div.pbl form.js-form input.button.js-loading-hide').click
wait.until {driver.find_element(:name, 'password')}
driver.find_element(:name, 'password').send_keys 'India@2020'
#driver.find_element(:xpath, '//*[@id="main-region"]//form/input').displayed?
driver.find_element(:xpath, '//*[@id="main-region"]//form/input').click
puts "Loggedinto the application"
wait.until {driver.find_element(:xpath, '//*[@id="root"]/div[1]/div/div/div[2]/button/div[2]/span')}
driver.find_element(:xpath, '//*[@id="root"]/div[1]/div/div/div[2]/button/div[2]/span').click
driver.find_element(:xpath, '//*[@id="root"]//ul[2]/li/a').click
puts "test End"