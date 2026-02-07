#importing user defined module
import calc

#importing built in module
import math

#Using the function in calc.py module
print(calc.add(5,6))
print(calc.power(5,3))

print(math.sqrt(25))

#importing with an alias
import random as rnd
print(rnd.randint(1,10))



#importing specific function
# getting current working direactory
from os import getcwd
print(getcwd())