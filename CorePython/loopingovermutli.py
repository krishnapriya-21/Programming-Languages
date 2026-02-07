#Looping over a list

fruits = ["apple","banana","mango","orange","watermelon","kiwi"]

#Print every fruit in the list
for fruit in fruits:
    print(f"Printing fruit in list:  {fruit}")

#Looping over a tuple

numbers = (10,20,30,40,50)

#Print every number in a tuple
for number in numbers:
    print(f"printing number in tuple :  {number}")


word="python"
#Looping over a string
for character in word:
    print(f"printing character in word: {character}")


company={"name":"apollo","branch":"perambur","students":50} 

#Looping over a dictionary
for key in company:
    print(key ,"=", company[key] )


#Looping over key and value of a dictionary
for key,value in company.items():
    print(key, "=", value)    