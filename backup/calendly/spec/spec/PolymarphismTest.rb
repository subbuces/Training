class Vehicle
  @@engine = 0
  def initialize(keytype,wheels,seats,etype)
    @keyType = keytype
    @total_wheels = wheels
    @no_of_seats = seats
    @@engine = etype
    def vtype
      if @@engine == 4
            puts "Vehicle is a Car"
      elsif @@engine == 3
            puts " Vehicle is a Auto"
      else
            puts "Vehicle is a Bike"
          end
    end    
  end
  def features
    puts "MAIN : Vehical with #{@keyType} and having #{@total_wheels} and seating capacity is #{@no_of_seats}"
  end
  def start
    puts "Engine starts by pushing or turning around with #{@keyType}"
  end
end

class Bike < Vehicle
  def start
    puts "Bike has a keytype model and it wont have push type"
  end
end

class Car < Vehicle
  def start
    puts "Car has jey type of Push"
  end
end

class Auto < Vehicle
  def features
    puts "Auto has #{@total_wheels} and key type is #{@keyType}"
  end
end

v1 = Vehicle.new("push", 6, 5, 4)
v1.start
v1.features
v1.vtype
v2 = Car.new("push",5,4,3)
v2.features()
v2.start()

