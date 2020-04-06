module A
  def a1
    puts "Testing A"
  end
end
module B
  def b1
    puts "Testing B"
  end
end
module C
  def c1
    puts "Testing C"
  end
end
module D
  def d1
    puts "Testing D"
  end
end
module E
  class Inner
    def e1
        puts "Testing E"
      end
  end
end

module Test
  class Simple
    include A
    include B
    include C
    include D
    include E
    def f1
      puts "Simple calls method F"
    end
  end
end

module Test2
  include A
  include B
  def x1
    puts "Test 2 midule for x1 method"
  end
end
class Testing
  include Test2
  def y1
    puts "Testing class with y1 method"
  end
end
te = Testing.new
te.y1
te.a1
te.b1
#op = Test::Simple.new
#op.a1
#op.b1
#op.c1
#op.d1
#op.f1
#
#ic = E::Inner.new
#ic.e1