# importing abstract base class and abstract method from abc module
from abc import ABC, abstractmethod

#The class vehicle inherits from ABC making it an abstract base class
class Vehicle(ABC):

    #marking start engine function as abstract 
    @abstractmethod
    #Ebvery subclass must implement its own startengine method
    def start_engine(self):
        pass

#Class car inherits from vehicle abstract base class
class Car(Vehicle):

    #Implementing start engine abstract method
    def start_engine(self):
       return "Car engine started"

class Bike(Vehicle):
    def start_engine(self):
        return "Bike engine started"


# Object creation
# a list of objects created . cannot instantiate vehicle as abstract class cannot be instantiated
vehicles = [Car(),Bike()]

for vehicle in vehicles:
    print(vehicle.start_engine())
