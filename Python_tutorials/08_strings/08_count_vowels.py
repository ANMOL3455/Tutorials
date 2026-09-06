text = input("Enter text: ").lower()
vowels = sum(1 for character in text if character in "aeiou")
print("Vowels:", vowels)
