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
# Step 3: Insert a single row
# ----------------------------------------
sql = "INSERT INTO customers (name, address) VALUES (?, ?)"
val = ("John", "Highway 21")
cur.execute(sql, val)
con.commit()
print(cur.rowcount, "record inserted.")

# ----------------------------------------
# Step 4: Insert multiple rows
# ----------------------------------------
sql = "INSERT INTO customers (name, address) VALUES (?, ?)"
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
cur.executemany(sql, val)
con.commit()
print(cur.rowcount, "records inserted.")

# ----------------------------------------
# Step 5: Select all rows
# ----------------------------------------
cur.execute("SELECT * FROM customers")
myresult = cur.fetchall()
print("\nAll rows:")
for x in myresult:
    print(x)

# ----------------------------------------
# Step 6: Select specific columns
# ----------------------------------------
cur.execute("SELECT name, address FROM customers")
myresult = cur.fetchall()
print("\nNames and addresses:")
for x in myresult:
    print(x)

# ----------------------------------------
# Step 7: Fetch one row
# ----------------------------------------
cur.execute("SELECT * FROM customers")
myresult = cur.fetchone()
print("\nFirst row only:")
print(myresult)