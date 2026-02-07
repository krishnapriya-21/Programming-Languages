#using forloop to print numbers to 10

for i in range (11):
    print("Number:",i)


#using start, stop and step in for loop range

for i in range(10,-1,-1):
    print("Number:", i) 


text = input("Enter any text:")
vowels="aeiouAEIOU"
counter=0

for char in text:
    if(char in vowels ):
        counter=counter+1
print(f"There are { counter} vowels in the given text")        