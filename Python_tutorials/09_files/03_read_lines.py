from pathlib import Path

path = Path("example.txt")
if path.exists():
    for line_number, line in enumerate(path.read_text(encoding="utf-8").splitlines(), 1):
        print(line_number, line)
else:
    print("File does not exist.")
