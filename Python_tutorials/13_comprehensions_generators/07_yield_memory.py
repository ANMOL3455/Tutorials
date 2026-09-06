def numbers(limit):
    for number in range(limit):
        yield number

values = numbers(3)
print(next(values))
print(next(values))
print(next(values))
