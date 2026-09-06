from pathlib import Path

path = Path("example.txt")
if path.exists():
    print(path.read_text(encoding="utf-8"))
else:
    print("File does not exist.")
