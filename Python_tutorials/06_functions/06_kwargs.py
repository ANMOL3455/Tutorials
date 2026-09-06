def show_profile(**details):
    for key, value in details.items():
        print(f"{key}: {value}")

show_profile(name="Anmol", skill="Python", level="Beginner")
