# Stack: last in, first out
stack = []
stack.append("A")
stack.append("B")
print("Stack pop:", stack.pop())

# Queue: first in, first out
from collections import deque
queue = deque(["A", "B"])
print("Queue pop:", queue.popleft())
