numbers = [1, 2, 3, 4, 5, 6]
result = list(map(lambda n: n * 10, filter(lambda n: n % 2 == 0, numbers)))
print(result)
