#Base class
class Animal():
    def speak(self):
        print("Some Sound")

class Dog(Animal):
    def speak(self):
        print("Dog barks")

class Cat(Animal):
    def speak(self):
        print("Cat Meows")

# creating list of object and assigning in pets variable
pets = [Dog(),Cat()]    

#iterating over each objects in the list
for pet in pets:
    pet.speak()