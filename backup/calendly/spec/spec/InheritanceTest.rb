class Mathematics
  def initialize (val1, val2)
    @valueA = val1
    @valueB = val2
    @valueC = @valueA + @valueB
  end
  def baseAdd
    puts "#{@valueC}"
  end
  
end

class Addition < Mathematics
  def addition
    @total = @valueA + @valueB + @valueC
  end
end

class Subtraction < Mathematics
  def initialize(a,b,c)
    @valueA = a
    @valueB = b
    @valueC = c
  end
  def sub
    @total = @valueA - @valueB - @valueC
    puts "#{@total}"
  end
end

math = Mathematics.new(20,50)
math.baseAdd()
puts "Child method - 1"
a1 = Addition.new(25,45)
x = a1.addition
puts x
a1.baseAdd()
puts "Child method - 2"
Sub1 = Subtraction.new(90,20,30)
Sub1.sub