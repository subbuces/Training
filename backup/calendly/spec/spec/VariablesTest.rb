class Student
  @@no_of_students = 0
  def initialize(id,name)
    @Stu_id = id
    @Std_name = name
    @@no_of_students +=1    
  end
  
  def student_details
    puts "student id is #{@Stu_id}"
    puts "student name is #{@Std_name}"
    puts "Total students are #{@@no_of_students}"
  end
  
  def  total_noof_students
    puts "#{@@no_of_students}"
  end
end
S1 = Student.new(4,"Subbarao")
S1.student_details
S1.total_noof_students
S2 = Student.new(5,"Siva")
S2.student_details