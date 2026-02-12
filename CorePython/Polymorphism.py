class Payment:
    
    def pay(self, amount):

        # Raising error of not implemented
        raise NotImplementedError
    
class Creditcard:

    def pay(self,amount):
        print(f"The amount {amount} was paid using credit card")

class Paypal:
    def pay(self,amount):
        print(f"The amount {amount} was paid using pay pal")  


# creating objects of the classes

methods = [Creditcard(),Paypal()]
for method in methods:
    method.pay(5000)              