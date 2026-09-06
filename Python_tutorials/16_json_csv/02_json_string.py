import json

text = '{"name": "Anmol", "age": 19}'
data = json.loads(text)
print(data["name"])
print(json.dumps(data, indent=2))
