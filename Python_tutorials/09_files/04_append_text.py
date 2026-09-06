from pathlib import Path

path = Path("example.txt")
with path.open("a", encoding="utf-8") as file:
    file.write("This line was appended.\n")
print(path.read_text(encoding="utf-8"))
