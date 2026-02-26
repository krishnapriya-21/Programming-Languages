 # Common string operations in python

#creating strings
programmingLanguage = "Python"

# 1.Accessing characters using index 
print("The character at  0th index is : ",programmingLanguage[0])
print("The character at -1th index is : ",programmingLanguage[-1])

# 2.Slicing Strings
#Accessing parts of string using [start:end:step]

text = "Programming"
print("The characters from 2nd index to 5th index are: ",text[2:5])
print("The characters from 3rd index are: ",text[3:])
print("The characters from 0th index stepping back by 1 are: ",text[::-1])

#3.Concatenation of strings

first = "Hello"
second= "world"
print(first + " " +second)

#4. Repetition of strings
print(first*5)

#5. Searching for substrings
fruit= "orange"
print("The character a if found in the index: ",fruit.find("a"))

#6. counting strings

fruit = "banana"
print("The character a is repeated for: ", fruit.count("a"), "times")

#7. modifying case

topic = "pYThon pRoGramming"
print("In upper case:" , topic.upper() )
print("In lower case: ", topic.lower())
print("Printing as title:" , topic.title())

#8. Removing extra spaces
greeting = " Hello world  "
print("Stripping extra spaces", greeting.strip())

#9. Replacing strings

lang = "python programming"
print("Replacing programming with world" , lang.replace("programming","world"))


#10. splitting strings
textfruits = "apple,banana,orange"
fruits = textfruits.split(",")
print("Text splitted as array",fruits)

# 11. joining strings
joined = "-".join(fruits)
print("Text joined as string ",joined)

#12. checking string properties

language= "python3"
print("Is alpha numeric ", language.isalnum())
print("Is alphabetics only ", language.isalpha())
print("Is text starts with py ", language.startswith("py"))