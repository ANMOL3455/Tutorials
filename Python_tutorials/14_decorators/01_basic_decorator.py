def log_call(function):
    def wrapper():
        print("Function is starting")
        function()
        print("Function is finished")
    return wrapper

@log_call
def greet():
    print("Hello")

greet()
