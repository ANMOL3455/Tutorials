from functools import wraps

def announce(function):
    @wraps(function)
    def wrapper(*args, **kwargs):
        print("Calling", function.__name__)
        return function(*args, **kwargs)
    return wrapper

@announce
def greet(name):
    """Return a greeting."""
    return f"Hello, {name}!"

print(greet("Anmol"))
print(greet.__name__)
print(greet.__doc__)
