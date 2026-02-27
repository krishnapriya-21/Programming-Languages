import sqlite3

# ----------------------------------------
# Step 1: Connect to SQLite database
# ----------------------------------------
# This will create 'mydatabase.db' file if it doesn’t exist
con = sqlite3.connect("mydatabase.db")
cur = con.cursor()

# ----------------------------------------
# Step 2: Create table if not exists
# ----------------------------------------
cur.execute("""
CREATE TABLE IF NOT EXISTS customers (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT,
    address TEXT
)
""")
con.commit()

# ----------------------------------------
# CREATE (Insert Data)
# ----------------------------------------
sql = "INSERT INTO customers (name, address) VALUES (?, ?)"
val = ("John", "Highway 21")
cur.execute(sql, val)
con.commit()
print(cur.rowcount, "record inserted.")

# ----------------------------------------
# READ (Select Data)
# ----------------------------------------
cur.execute("SELECT * FROM customers")
myresult = cur.fetchall()
print("\nAll rows:")
for x in myresult:
    print(x)

# ----------------------------------------
# UPDATE (Modify Data)
# ----------------------------------------
sql = "UPDATE customers SET address = ? WHERE name = ?"
val = ("Canyon 123", "John")
cur.execute(sql, val)
con.commit()
print(cur.rowcount, "record(s) updated.")

# Verify update
cur.execute("SELECT * FROM customers WHERE name = 'John'")
print("\nUpdated John:")
print(cur.fetchone())

# ----------------------------------------
# DELETE (Remove Data)
# ----------------------------------------
sql = "DELETE FROM customers WHERE name = ?"
val = ("John",)
cur.execute(sql, val)
con.commit()
print(cur.rowcount, "record(s) deleted.")

# Verify delete
cur.execute("SELECT * FROM customers WHERE name = 'John'")
print("\nAfter delete (should be None):")
print(cur.fetchone())