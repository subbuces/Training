class Student
  attr_reader :s_id
  attr_accessor :s_name, :s_add
  
  def initialize(id, name, add)
    @s_id = id
    @s_name = name
    @s_add = add
  end
  
  def update_student_info(name,add)
#    u_name = name
#    u_add = add
    puts "Updated details are #{name} and #{add}"
  end
end

s1 = Student.new(1,"subbu","navallure - chennai")
puts s1.s_id
puts s1.s_name
puts s1.s_add

s1.s_name = "Nani"
puts s1.s_name
s1.update_student_info("Siva","Chennai")