#Writing a program to store your wish for 2030

#getting input from the user for wish
wish = input("What is your secret wish for 2030?")


#opening a file in write mode with WITH statement
with open("digitalcapsule.txt","w") as capsule:
    capsule.write(wish)

print("Your wish is stored in the capsule")

answer = input("Do you want to see your secret wish? y/n")

if (answer=="y"):
    with open("digitalcapsule.txt","r") as capsule:
        print("Your secret wish for 2030 is : ",capsule.read())    
else:
    print("capsule is closed")