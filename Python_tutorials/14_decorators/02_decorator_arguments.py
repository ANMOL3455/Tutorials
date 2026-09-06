def announce(function):
    def wrapper(*args, **kwargs):
        print("Calling function...")
        result = function(*args, **kwargs)
        print("Done")
        return result
    return wrapper

@announce
def add(a, b):
    return a + b

print(add(2, 3))
