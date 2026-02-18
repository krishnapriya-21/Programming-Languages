<<<<<<< HEAD
#!C:\Program Files (x86)\Python37-32\python.exe
print("Content-Type:text/HTML\n\r\n\r")
import cgi,cgitb
cgitb.enable()
form=cgi.FieldStorage()
bg=form.getvalue("bloodgroup")
import mysql.connector
con=mysql.connector.connect(host="localhost",user="root",password="",database="sushmitha")
cur=con.cursor()
cur.execute("select HospitalName,Mobileno,Address,BloodGroup from hosp where bloodgroup=%s ",(bg,))
print("<table border=1 width=40% align=center bgcolor=#ffddaa >")
print("<tr><td>HospitalName</td><td>Mobileno</td><td>Address</td><td>BloodGroup</td></tr>")
for(HospitalName,Mobileno,Address,BloodGroup)in cur:
    print("<tr><td>",HospitalName,"</td><td>",Mobileno,"</td><td>",Address,"</td><td>",BloodGroup,"</td></tr>")
print("</table>")
con.commit()
cur.close()
con.close()





=======
#!C:\Program Files (x86)\Python37-32\python.exe
print("Content-Type:text/HTML\n\r\n\r")
import cgi,cgitb
cgitb.enable()
form=cgi.FieldStorage()
bg=form.getvalue("bloodgroup")
import mysql.connector
con=mysql.connector.connect(host="localhost",user="root",password="",database="sushmitha")
cur=con.cursor()
cur.execute("select HospitalName,Mobileno,Address,BloodGroup from hosp where bloodgroup=%s ",(bg,))
print("<table border=1 width=40% align=center bgcolor=#ffddaa >")
print("<tr><td>HospitalName</td><td>Mobileno</td><td>Address</td><td>BloodGroup</td></tr>")
for(HospitalName,Mobileno,Address,BloodGroup)in cur:
    print("<tr><td>",HospitalName,"</td><td>",Mobileno,"</td><td>",Address,"</td><td>",BloodGroup,"</td></tr>")
print("</table>")
con.commit()
cur.close()
con.close()





>>>>>>> dbd3e2ab837c33daad8a96b16a734ce6548d7779
