import sqlite3

# Step 1: Connect to the database (creates file if it doesn’t exist)
con = sqlite3.connect("mydatabase.db")

# Step 2: Create a cursor object
cur = con.cursor()

# Step 3: Create table if not exists
cur.execute("""
CREATE TABLE IF NOT EXISTS users (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    NAME TEXT,
    AGE INTEGER,
    CITY TEXT
)
""")
con.commit()

# ----------------------------------------
# Step 2: Define functions for CRUD operations
# ----------------------------------------

# Function to insert a new user record into the 'users' table
def insertData(name, age, city):
    qry = "insert into users (NAME, AGE, CITY) values (?,?,?);"  # SQL insert query
    con.execute(qry, (name, age, city))  # Execute query with parameters
    con.commit()  # Save changes to the database
    print("User Details Added")

# Function to update an existing user record based on ID
def updateData(name, age, city, id):
    qry = "update users set NAME=?, AGE=?, CITY=? where id=?;"  # SQL update query
    con.execute(qry, (name, age, city, id))  # Execute query with parameters
    con.commit()  # Save changes
    print("User Details Updated")

# Function to delete a user record based on ID
def deleteData(id):
    qry = "delete from users where id=?;"  # SQL delete query
    con.execute(qry, (id,))  # Execute query with parameter (tuple required)
    con.commit()  # Save changes
    print("User Details Deleted")

# Function to select and display all user records
def selectData():
    qry = "select * from users"  # SQL select query
    result = con.execute(qry)  # Execute query
    for row in result:  # Loop through results
        print(row)

# ----------------------------------------
# Step 3: Display menu options
# ----------------------------------------
print("""
1. Insert
2. Update
3. Delete
4. Select
""")

# ----------------------------------------
# Step 4: Menu-driven loop for user input
# ----------------------------------------
ch = 1
while ch == 1:
    c = int(input("Select Your Choice : "))  # Ask user for choice

    # If user chooses Insert
    if c == 1:
        print("Add New Record")
        name = input("Enter Name : ")
        age = input("Enter Age : ")
        city = input("Enter City : ")
        insertData(name, age, city)

    # If user chooses Update
    elif c == 2:
        print("Edit A Record")
        id = input("Enter ID : ")
        name = input("Enter Name : ")
        age = input("Enter Age : ")
        city = input("Enter City : ")
        updateData(name, age, city, id)

    # If user chooses Delete
    elif c == 3:
        print("Delete A Record")
        id = input("Enter ID : ")
        deleteData(id)

    # If user chooses Select
    elif c == 4:
        print("Print All Records")
        selectData()

    # If user enters an invalid choice
    else:
        print("Invalid Selection")

    # Ask if user wants to continue
    ch = int(input("Enter 1 To Continue : "))