# A package is a directory containing Python modules.
# Modern Python can use namespace packages, but __init__.py is still common.

from pathlib import Path

print("A typical package:")
print("my_package/")
print("  __init__.py")
print("  math_tools.py")
print("  text_tools.py")
print("Example import: from my_package.math_tools import add")
print("Current directory:", Path.cwd())
