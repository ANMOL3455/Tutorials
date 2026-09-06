contacts = {}

while True:
    print("\n1 Add  2 Search  3 List  4 Delete  5 Exit")
    choice = input("Choice: ")
    if choice == "1":
        name = input("Name: ").strip()
        phone = input("Phone: ").strip()
        contacts[name] = phone
    elif choice == "2":
        name = input("Name: ").strip()
        print(contacts.get(name, "Not found"))
    elif choice == "3":
        for name, phone in sorted(contacts.items()): print(name, phone)
    elif choice == "4":
        name = input("Name: ").strip()
        contacts.pop(name, None)
    elif choice == "5": break
    else: print("Invalid choice")
