#Getting user input for number to pass

passAt = int(input("Enter the number to pass at :"))

for i in range(5):
    if(i==passAt):
        #Does nothing , just placeholder
        pass
    print("Processing", i)