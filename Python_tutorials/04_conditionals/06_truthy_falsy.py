values = [0, 1, "", "hello", [], [1], None]
for value in values:
    print(repr(value), "->", bool(value))
