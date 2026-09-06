age = int(input("Age: "))
has_id = input("Do you have ID? (yes/no): ").lower() == "yes"

if age >= 18:
    if has_id:
        print("Access allowed")
    else:
        print("Bring an ID")
else:
    print("Access denied")
