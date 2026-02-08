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


