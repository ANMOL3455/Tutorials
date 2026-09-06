from datetime import datetime

now = datetime.now()
print("Current date/time:", now)
print("Year:", now.year)
print("Formatted:", now.strftime("%Y-%m-%d %H:%M:%S"))
