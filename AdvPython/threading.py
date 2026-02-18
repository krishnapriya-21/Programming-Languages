<<<<<<< HEAD
import time
from threading import Thread

def one(x):
    for i in range(0,5):
        time.sleep(2)
        print("I am printing one\n")
        print(x)

def Two(y):
    for i in range(0,5):
        time.sleep(2)
        print("I am printing Two\n")
        print(y)


t1=Thread(target=one,args=(2,))
t2=Thread(target=Two,args=(4,))


t1.start()
t2.start()









=======
import time
from threading import Thread

def one(x):
    for i in range(0,5):
        time.sleep(2)
        print("I am printing one\n")
        print(x)

def Two(y):
    for i in range(0,5):
        time.sleep(2)
        print("I am printing Two\n")
        print(y)


t1=Thread(target=one,args=(2,))
t2=Thread(target=Two,args=(4,))


t1.start()
t2.start()









>>>>>>> dbd3e2ab837c33daad8a96b16a734ce6548d7779
