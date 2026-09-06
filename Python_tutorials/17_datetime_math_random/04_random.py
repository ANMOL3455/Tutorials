import random

numbers = list(range(1, 11))
random.shuffle(numbers)
print(numbers)
print(random.sample(numbers, 3))
