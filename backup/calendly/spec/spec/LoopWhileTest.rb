b =5
for i in 1..10
  if b < i
    puts "B value is :#{i}"
  end
end

name = ["subu","siva","a","padma","sindhu","Thulasi"]
for i in name
  print i
end
puts "----------"
a = 0
c = 4
until a > c
  puts "number is #{a}"
  a+=1
end

puts "@@@@@@@@@@"
10.times do
  puts "Subbu"
end


puts "-----1234-----"
name.each do |v|
  puts "Name of the user is : #{v}"
end