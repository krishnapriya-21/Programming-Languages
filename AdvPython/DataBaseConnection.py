import mysql.connector

# Step 1: Connect to MySQL server (without selecting a database yet)
mydb = mysql.connector.connect(
  host="localhost",
  user="root",
  passwd=""   # Add your password here if required
)

mycursor = mydb.cursor()

# Step 2: Create database (only if it doesn’t already exist)
mycursor.execute("CREATE DATABASE IF NOT EXISTS mydatabase")

# Step 3: Reconnect, this time selecting the database
mydb = mysql.connector.connect(
  host="localhost",
  user="root",
  passwd="",   # Add your password here if required
  database="mydatabase"
)

mycursor = mydb.cursor()

# Step 4: Create table (only if it doesn’t already exist)
mycursor.execute("CREATE TABLE IF NOT EXISTS customers (name VARCHAR(255), address VARCHAR(255))")

# Step 5: Insert a single row
sql = "INSERT INTO customers (name, address) VALUES (%s, %s)"
val = ("John", "Highway 21")
mycursor.execute(sql, val)
mydb.commit()
print(mycursor.rowcount, "record inserted.")

# Step 6: Insert multiple rows
sql = "INSERT INTO customers (name, address) VALUES (%s, %s)"
val = [
  ('Peter', 'Lowstreet 4'),
  ('Amy', 'Apple st 652'),
  ('Hannah', 'Mountain 21'),
  ('Michael', 'Valley 345'),
  ('Sandy', 'Ocean blvd 2'),
  ('Betty', 'Green Grass 1'),
  ('Richard', 'Sky st 331'),
  ('Susan', 'One way 98'),
  ('Vicky', 'Yellow Garden 2'),
  ('Ben', 'Park Lane 38'),
  ('William', 'Central st 954'),
  ('Chuck', 'Main Road 989'),
  ('Viola', 'Sideway 1633')
]
mycursor.executemany(sql, val)
mydb.commit()
print(mycursor.rowcount, "records inserted.")

# Step 7: Select all rows
mycursor.execute("SELECT * FROM customers")
myresult = mycursor.fetchall()
print("\nAll rows:")
for x in myresult:
  print(x)

# Step 8: Select specific columns
mycursor.execute("SELECT name, address FROM customers")
myresult = mycursor.fetchall()
print("\nNames and addresses:")
for x in myresult:
  print(x)

# Step 9: Fetch one row
mycursor.execute("SELECT * FROM customers")
myresult = mycursor.fetchone()
print("\nFirst row only:")
print(myresult)