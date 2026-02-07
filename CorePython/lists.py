#Adding list of fruits in array as lists
fruits=["apple","banana","orange","strawberry"]
print(fruits)

#getting user input to add in list

fruit= input("Enter a fruit name to append:")
fruits.append(fruit)

print(fruit, "Appended to list")
print(fruits)

#getting user input to delete from list
fruitdelete= input("Enter the fruit to delete:")
fruits.remove(fruitdelete)

print(f"{fruitdelete} is removed from the list")
print(fruits)