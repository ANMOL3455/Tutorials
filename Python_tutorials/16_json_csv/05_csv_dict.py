import csv

rows = [
    {"name": "Anmol", "marks": 90},
    {"name": "Sita", "marks": 85},
]

with open("students_dict.csv", "w", newline="", encoding="utf-8") as file:
    writer = csv.DictWriter(file, fieldnames=["name", "marks"])
    writer.writeheader()
    writer.writerows(rows)

with open("students_dict.csv", "r", newline="", encoding="utf-8") as file:
    for row in csv.DictReader(file):
        print(row)
