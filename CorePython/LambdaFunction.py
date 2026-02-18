#Writing Short Functions using lambda keyword

#Printing square of a number
number = int(input("Enter the number to square:"))
#Passing single argument
square= lambda x:x*x

print(square(number))


#Getting user input
num1 = int(input("enter first number:"))
num2 = int(input("Enter the second number:"))

#passing multiple arguments

sum= lambda a,b: a+b
print(sum(num1,num2))


#List with numbers 

list1 = [1,2,3,4,5]

#Map function , to iterate over the elements in the list into a function

cube = map(lambda x: x**3, list1)

#map returns an object, convert it into list
print("The cube of numbers are: " , list(cube))


#printing even numbers with filter function

list2 = [15,20,30,35,40,45,50]

even = list(filter(lambda x: x%2==0,list2))

print("The even numbers from the list are: ",even)

#Finding the maximum number with reduce function in lamda

numbers = []

for i in range(5):
    num = int(input("Enter the number to add in list:"))
    numbers.append(num)

#importing reduce function from functools
from functools import reduce

#Using reduce function
maximum = reduce(lambda a,b: a if a>b else b, numbers)
print("The maximum number entered is :",maximum)
   