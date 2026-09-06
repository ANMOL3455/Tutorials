from pathlib import Path

current = Path.cwd()
print("Current directory:", current)
print("Python files:")
for path in current.glob("*.py"):
    print(path.name)
