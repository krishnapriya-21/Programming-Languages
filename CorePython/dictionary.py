#Getting user inputs from user
name = input("Enter name:")
age= int(input("Enter age:"))
grade= input("Enter grade: ")

# student dictionary to hold key and value 
student = {"name":{name},"age":{age}, "grade":{grade}}
print(student)

#Getting key value to delete from the dictionary
keyDel= input("Enter key to delete from student dictionary: ")

#Deleting key and its value from dictionary
student.pop(keyDel)
print(student)

#Getting input key and input value
KeyAdd = input("Enter key to add in student dictionary: ")
valueAdd = input("Enter Value to add in student dictionary: ")

#Adding key and value to the dictionary
student[KeyAdd]=valueAdd

#printing student dictionary
print(student)
