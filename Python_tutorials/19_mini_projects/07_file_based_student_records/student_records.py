from pathlib import Path
import json

FILE = Path("students.json")

def load():
    if not FILE.exists(): return []
    return json.loads(FILE.read_text(encoding="utf-8"))

def save(records):
    FILE.write_text(json.dumps(records, indent=2), encoding="utf-8")

records = load()
name = input("Student name: ").strip()
marks = float(input("Marks: "))
records.append({"name": name, "marks": marks})
save(records)
print("Saved. Current records:")
for record in records: print(record)
