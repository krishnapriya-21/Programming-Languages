#Positional Arguments = matched by order 
def greet(name,age):
 print(f"Hello,{name} , your age is : {age}")

name1= input("what is your name?")
age1 = input("What is your age?")
greet(name1,age1)

#keyword arguments are matched by name not order
def power(a,b):
 print("The power of a to the b is : ", a**b)

num1 = int(input("Enter a:"))
num2 = int(input("Enter b:"))

power(a=num1,b=num2)

#Default arguments
def wish(name,wish="Happy Birthday!"):
 print(f"Hello {name}, {wish}")

wish("Apollo","Happy Anniversary") 

#Variable length arguments

# *args collects extra positional arguments as tuple
def printing(*args):
 print(args)

printing(1,2,3,4,5) 

# **args collects extra keyword arguments as dictionaries ( key and value pair)

def prints(**kwargs):
 print(kwargs)

prints(name="krishna", age="12") 