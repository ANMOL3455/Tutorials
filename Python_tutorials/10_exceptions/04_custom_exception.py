class InsufficientMarksError(Exception):
    """Raised when marks are outside the accepted range."""


def validate_marks(marks):
    if not 0 <= marks <= 100:
        raise InsufficientMarksError("Marks must be between 0 and 100")

validate_marks(85)
print("Marks are valid")
