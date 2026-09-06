def set_age(age):
    if age < 0:
        raise ValueError("Age cannot be negative")
    return age

print(set_age(19))
