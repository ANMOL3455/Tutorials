from pathlib import Path

path = Path("people.txt")
path.write_text("name,age\nAnmol,19\nSita,20\n", encoding="utf-8")
for line in path.read_text(encoding="utf-8").splitlines():
    print(line.split(","))
