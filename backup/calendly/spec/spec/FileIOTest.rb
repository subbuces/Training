#puts File.exist?('ClassTest.rb')

#aFile = File.new('C:\Users\user1.CESIT-LAP-0012\workspace\calendly\spec\spec\TestData.rb','w')
#aFile.syswrite('First line text')
#puts " --- "
#puts "Subbu added new text into file line 2"
#puts "Subbu added new text into file line 3"
#aFile.syswrite('second line text')
#aFile.close

#bFile = File.open('C:\Users\user1.CESIT-LAP-0012\workspace\calendly\spec\spec\data.rb','r')
#bFile.each {|line| puts line}
#bFile.close

#cFile = File.open('C:\Users\user1.CESIT-LAP-0012\workspace\calendly\spec\spec\TestData.rb','r')
#cFile.each {|line| puts line}
#cFile.close
def read_my_file(file)
  begin
    aFile = File.open(file,'r')
    aFile.each{|line| puts line}
  rescue
    raise "File is not existed"
  end
end

read_my_file('TestData.rb')
#read_my_file('C:\Users\user1.CESIT-LAP-0012\workspace\calendly\spec\spec\TestData.txt')
#read_my_file('C:\Users\user1.CESIT-LAP-0012\workspace\calendly\spec\spec\TestData.rb')