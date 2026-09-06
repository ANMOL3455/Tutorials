import json
from pathlib import Path

data = {"name": "Anmol", "age": 19, "skills": ["Python", "C"]}
path = Path("student.json")
path.write_text(json.dumps(data, indent=4), encoding="utf-8")
loaded = json.loads(path.read_text(encoding="utf-8"))
print(loaded)
