from pathlib import Path

path = Path("modes_demo.txt")
with path.open("w", encoding="utf-8") as file:
    file.write("write mode\n")
with path.open("a", encoding="utf-8") as file:
    file.write("append mode\n")
with path.open("r", encoding="utf-8") as file:
    print(file.read())
