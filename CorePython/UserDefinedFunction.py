
#Get user name as input

name = input("Enter your name:")
#Passing default input arguments to the function
def greet(username="admin"):
    print(f"Hello, {username}")

#Calling function returns default username
greet()

#calling function returns input user name
greet(name)

#-----------------------------------------------------

birthyear = int(input("Enter your birth year: "))
currentyear=2025
#function to calculate age
def calculateAge(year):
 return  currentyear-year

#calling function to calculate age
print("Your Age is :",calculateAge(birthyear))

#--------------------------------------------------------
#Getting inputs from user 
favColor = input("Enter your favourite color:")
favNum= int(input("Enter your favourite number :"))

#passing inputs as keyword arguments

def favourites (Color,Num):
   print("Your Favourite Color is:" , Color)
   print("Your favourite number is :", Num)

#Calling the function and passing argument values with keyword
favourites(Num=favNum,Color=favColor)   