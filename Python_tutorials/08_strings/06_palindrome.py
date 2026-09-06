text = input("Enter text: ").strip().lower()
cleaned = "".join(character for character in text if character.isalnum())
print("Palindrome" if cleaned == cleaned[::-1] else "Not palindrome")
