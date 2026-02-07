
#Try a block of code
try:
    number = int(input("Enter a number :"))
    print("You have entered a number", number)

#Pass exception condition and block of code to run on exception    
except ValueError:
    print("Entered Input is not a Valid number")


#Dividing by zero exception 

try:
    number= int(input("Enter the number to divide:"))
    divident = int(input("Enter the divident number:"))
    result= number/divident
    print("The Answer is:", result)
except ZeroDivisionError:
    print("Division by zero is not allowed")
else:
    print("Division is successful")
finally:
    print("task Executed successfully")            

    

    