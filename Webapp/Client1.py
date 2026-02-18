#!C:\Program Files (x86)\Python37-32\python.exe
print("Content-Type:text/HTML\n\r\n\r")
import cgi,cgitb
cgitb.enable()
form=cgi.FieldStorage()
bg=form.getvalue("bloodgroup")
import mysql.connector
con=mysql.connector.connect(host="localhost",user="root",password="",database="sushmitha")
cur=con.cursor()
cur.execute("select name,gender,dob,bloodgroup,contactno,address from register where bloodgroup=%s ",(bg,))
print("<table border=1 width=40% align=center bgcolor=#ffddaa >")
print("<tr><td>Name</td><td>Gender</td><td>DOB</td><td>BloodGroup</td><td>ContactNo</td><td>Address</td></tr>")
for(name,gender,dob,bloodgroup,contactno,address)in cur:
    print("<tr><td>",name,"</td><td>",gender,"</td><td>",dob,"</td><td>",bloodgroup,"</td><td>",contactno,"</td><td>",address,"</td></tr>")
print("</table>")

con.commit()
cur.close()
con.close()





