# ----------------------------------------
# Step 1: Define a class
# ----------------------------------------
class Car:
    # Constructor method to initialize object attributes
    def __init__(self, brand, model, year):
        self.brand = brand
        self.model = model
        self.year = year

    # Method to display car details
    def display_info(self):
        print(f"Car: {self.year} {self.brand} {self.model}")

    # Method to simulate starting the car
    def start(self):
        print(f"{self.brand} {self.model} is starting...")

    # Method to simulate stopping the car
    def stop(self):
        print(f"{self.brand} {self.model} has stopped.")

# ----------------------------------------
# Step 2: Create objects (instances of the class)
# ----------------------------------------
car1 = Car("Toyota", "Corolla", 2020)
car2 = Car("Honda", "Civic", 2022)

# ----------------------------------------
# Step 3: Use object methods
# ----------------------------------------
car1.display_info()   # Shows details of car1
car1.start()          # Starts car1
car1.stop()           # Stops car1

print()  # Just for spacing

car2.display_info()   # Shows details of car2
car2.start()          # Starts car2
car2.stop()           # Stops car2