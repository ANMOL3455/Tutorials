tasks = []

while True:
    print("\n1 Add  2 View  3 Complete  4 Delete  5 Exit")
    choice = input("Choice: ")
    if choice == "1":
        tasks.append({"title": input("Task: "), "done": False})
    elif choice == "2":
        for index, task in enumerate(tasks, 1):
            mark = "[x]" if task["done"] else "[ ]"
            print(index, mark, task["title"])
    elif choice == "3":
        try: tasks[int(input("Task number: ")) - 1]["done"] = True
        except (ValueError, IndexError): print("Invalid task")
    elif choice == "4":
        try: tasks.pop(int(input("Task number: ")) - 1)
        except (ValueError, IndexError): print("Invalid task")
    elif choice == "5": break
    else: print("Invalid choice")
