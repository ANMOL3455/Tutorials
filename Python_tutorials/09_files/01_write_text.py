from pathlib import Path

path = Path("example.txt")
path.write_text("Hello from Python file handling.\n", encoding="utf-8")
print("Written to", path.resolve())
