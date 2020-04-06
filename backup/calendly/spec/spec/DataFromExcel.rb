require "rubygems"
require "selenium-webdriver"
require "simple-spreadsheet"

excel_data = SimpleSpreadsheet::Workbook.read("LoinTestData.xlsx")
mail_id = excel_data.cell(2,1)
pwd = execl_Data.cell(2,2)
puts "#{mail_id}"
puts "#{pwd}"
puts "Done"
