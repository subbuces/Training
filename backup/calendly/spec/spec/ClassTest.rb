class Dog
  def name_of_the_dog(name)
    puts "My name is : #{name}"
  end

  def eat
    puts "I am eating"
  end

  def sleep
    puts "I am sleeping"
  end
  
  def bark
      puts "I am barking"
    end
end

dog1 = Dog.new
dog1.name_of_the_dog("subbu")
dog1.bark
dog1.eat
dog1.sleep