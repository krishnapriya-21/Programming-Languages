# Getting input from user to continue (Skip) and print the series

skipAt = int (input("Enter the number you want to skip:"))

for i in range(11):
    if(i==skipAt):
        print("Skipping the value at:", i)
        continue
    print("The current number is:" , i)    