 #Get input from the user to find the number is odd or even

number = int(input("Enter the number to find even or odd number:"))

if(number>0):
    if(number%2==0):
        print("The Number is Even")
    else:
        print("The number is Odd")

else:
    print("The number is a non negative number")            