import speech_recognition as sr
from tkinter import *

def recognize():
    r = sr.Recognizer()
    with sr.Microphone() as source:
        audio = r.listen(source)
        try:
            text = r.recognize_google(audio)
            label.config(text=text)
        except sr.UnknownValueError:
            label.config(text="Could not recognize")
        except sr.RequestError:
            label.config(text="API unavailable")

win = Tk()
Button(win, text="Speak", command=recognize).pack()
label = Label(win, text="")
label.pack()
win.mainloop()