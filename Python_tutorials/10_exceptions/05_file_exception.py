from pathlib import Path

try:
    print(Path("missing.txt").read_text(encoding="utf-8"))
except FileNotFoundError:
    print("The file was not found.")
