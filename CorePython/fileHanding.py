#Writing to a file
file = open("example.txt","w")

#Writting in a file
file.write("This is my first file \n")

file.write("Python makes file handling easy\n")

#closing the file
file.close()

#Reading the file
file= open("example.txt","r")
print(file.read())

file.close()
