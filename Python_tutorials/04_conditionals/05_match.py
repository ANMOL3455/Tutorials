choice = input("Choose start, stop, or pause: ").lower()

match choice:
    case "start":
        print("Starting")
    case "stop":
        print("Stopping")
    case "pause":
        print("Paused")
    case _:
        print("Unknown command")
