from tkinter import *

window = Tk()

text = Text(window, height=10, width=40)
text.pack()

def display():
    entered_text = text.get("1.0", "end-1c")  # get from line 1, char 0 to end-1 char
    print("entered:", entered_text)

b = Button(window, text="display", command=display)
b.pack()

window.mainloop()