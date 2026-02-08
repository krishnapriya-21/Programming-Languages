#impoerting regular expression module

import re

# Simple Regex pattern

pattern= r"Cat"
text = "Cat sat on mat"
match = re.search(pattern,text)
print (match.group())

#Using meta characters

pattern= r"\d+"  # Matches one or more digits
text =" The company phone number is : 1234567890" 
match = re.search(pattern,text)
print(match.group())

#Using find all instaces of a pattern method

pattern = r"[aeiouAEIOU]"
text = "Python Programming Language"
match = re.findall(pattern, text)
print(match)


# Real World applications

# email verification
pattern =r"^[\w\.-]+@[\w\.-]+\.\w+$"
text = input("enter your email address: ")
match = bool(re.match(pattern,text))
if (match):
    print("valid email address")
else:
    print("Invalid Email address") 


# Password strength check
pattern = r"^(?=.*[a-z])(?=.*[A-Z])(?=.*0-9)"
password = input("Enter your python: ")
match = bool(re.match(pattern, password))
if match:
    print("Your password is strong")
else:
    print("Your password is weak")       
