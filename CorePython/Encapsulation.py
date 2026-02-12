class BankAccount:
    def __init__(self,owner,balance=0):
        self.owner = owner
        self.__balance = balance  # private attribute

    
    def deposit(self,amount):
        self.__balance += amount

    def withdrawal(self, amount):
        if (self.__balance>amount):
            self.__balance -= amount 
        else:
            print("Insufficient funds") 

    def get_balance(self):
        return self.__balance        


account = BankAccount("krishna", 5000)
account.deposit(10000)
print("balance after deposit:", account.get_balance())

