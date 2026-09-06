message = "global"

def demo():
    message = "local"
    print("Inside:", message)

demo()
print("Outside:", message)
