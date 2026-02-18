#!C:\Program Files (x86)\Python37-32\python.exe
print("Content-Type:text/HTML\n\r\n\r")
import cgi,cgitb
cgitb.enable()
form=cgi.FieldStorage()
bg=form.getvalue("bloodgroup")
import mysql.connector
con=mysql.connector.connect(host="localhost",user="root",password="",database="sushmitha")
cur=con.cursor()
cur.execute("select BankingName,Mobileno,Address,BloodGroup from bank where bloodgroup=%s ",(bg,))
print("<table border=1 width=40% align=center bgcolor=#ffddaa >")
print("<tr><td>BankingName</td><td>Mobileno</td><td>Address</td><td>BloodGroup</td></tr>")
for(BankingName,Mobileno,Address,BloodGroup)in cur:
    print("<tr><td>",BankingName,"</td><td>",Mobileno,"</td><td>",Address,"</td><td>",BloodGroup,"</td></tr>")
print("</table>")
con.commit()
cur.close()
con.close()





