import mysql.connector

# Step 1: Connect to MySQL server and database
mydb = mysql.connector.connect(
  host="localhost",
  user="root",
  passwd="",   # Add your password if required
  database="mydatabase"
)

mycursor = mydb.cursor()

# -------------------------------
# CREATE (Insert Data)
# -------------------------------
sql = "INSERT INTO customers (name, address) VALUES (%s, %s)"
val = ("John", "Highway 21")
mycursor.execute(sql, val)
mydb.commit()
print(mycursor.rowcount, "record inserted.")

# -------------------------------
# READ (Select Data)
# -------------------------------
mycursor.execute("SELECT * FROM customers")
myresult = mycursor.fetchall()
print("\nAll rows:")
for x in myresult:
    print(x)

# -------------------------------
# UPDATE (Modify Data)
# -------------------------------
sql = "UPDATE customers SET address = %s WHERE name = %s"
val = ("Canyon 123", "John")
mycursor.execute(sql, val)
mydb.commit()
print(mycursor.rowcount, "record(s) updated.")

# Verify update
mycursor.execute("SELECT * FROM customers WHERE name = 'John'")
print("\nUpdated John:")
print(mycursor.fetchone())

# -------------------------------
# DELETE (Remove Data)
# -------------------------------
sql = "DELETE FROM customers WHERE name = %s"
val = ("John",)
mycursor.execute(sql, val)
mydb.commit()
print(mycursor.rowcount, "record(s) deleted.")

# Verify delete
mycursor.execute("SELECT * FROM customers WHERE name = 'John'")
print("\nAfter delete (should be None):")
print(mycursor.fetchone())