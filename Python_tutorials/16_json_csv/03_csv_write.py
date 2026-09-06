import csv

with open("students.csv", "w", newline="", encoding="utf-8") as file:
    writer = csv.writer(file)
    writer.writerow(["Name", "Marks"])
    writer.writerow(["Anmol", 90])
    writer.writerow(["Sita", 85])

print("CSV written")
