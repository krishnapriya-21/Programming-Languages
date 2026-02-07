#Get user input to break the printing

breakAt= int(input("Enter the number to break at:"))

for i in range(11):
    if(i==breakAt):
        print("Breaking loop at:" , i)
        break
    print("The number is : " , i)