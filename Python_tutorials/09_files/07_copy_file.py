from pathlib import Path
import shutil

source = Path("source.txt")
destination = Path("copy.txt")
source.write_text("File to copy.\n", encoding="utf-8")
shutil.copy2(source, destination)
print(destination.read_text(encoding="utf-8"))
