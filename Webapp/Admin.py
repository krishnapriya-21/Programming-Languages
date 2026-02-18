#!C:\Program Files (x86)\Python37-32\python.exe
print("Content-Type:text/HTML\n\r\n\r")
import cgi,cgitb
cgitb.enable()
form=cgi.FieldStorage()
t1=form.getvalue("name")
t2=form.getvalue("pwd")
import mysql.connector
con=mysql.connector.connect(host="localhost",user="root",password="",database="sushmitha")
cur=con.cursor()
cur.execute("Select Username from admin where Username='" + t1 + "' and Password='" + t2 + "'")
ch=0
print("<h3>Login Failed</h3>")
for (Username) in cur:
    print("<tr><td>",Username,"</td></tr>")
    ch=1
cur.close()
con.close()

if ch==1:
   redirectURL = "AdminPage.html"
   print('   <meta http-equiv="refresh" content="0;url='+str(redirectURL)+'"/>')
else:
   redirectURL = "Admin.html"
