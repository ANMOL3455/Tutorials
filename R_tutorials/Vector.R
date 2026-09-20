# R Programming: Vectors

# A vector is a collection of values of the same basic data type.

# Vectors are one of the most important data structures in R.

# 1. Creating a Vector

numbers <- c(10, 20, 30, 40, 50)
names <- c("Anmol", "Ram", "Sita")
marks <- c(80, 75, 90)

numbers
names
marks

# 2. Checking a Vector

length(numbers)       # Number of elements
typeof(numbers)       # Data type
is.vector(numbers)    # Checks if it is a vector

# 3. Indexing

# R indexing starts from 1.

numbers[1]             # First element
numbers[3]             # Third element
numbers[2:4]           # Elements 2 to 4
numbers[c(1, 3, 5)]    # Selected elements

# 4. Negative Indexing

numbers[-1]            # Remove first element
numbers[-c(2, 4)]      # Remove elements 2 and 4

# 5. Logical Indexing

numbers[numbers > 25]
numbers[numbers >= 30]

# 6. Vector Operations

a <- c(10, 20, 30)
b <- c(2, 4, 5)

a + b
a - b
a * b
a / b

# 7. Scalar Operations

a * 2
a + 5

# 8. Vector Functions

sum(a)
mean(a)
min(a)
max(a)
median(a)
prod(a)

# 9. Sorting

sort(a)
sort(a, decreasing = TRUE)

# 10. Useful Functions

unique(c(10, 20, 20, 30))
duplicated(c(10, 20, 20, 30))
which(a == 20)
which.min(a)
which.max(a)

# 11. Sequence and Repetition

1:5
seq(1, 10, by = 2)
rep(5, times = 3)

# 12. Adding and Changing Elements

x <- c(10, 20, 30)

x <- c(x, 40)      # Add element
x[2] <- 25         # Change element
x <- x[-1]         # Remove first element

x

# 13. Named Vector

marks <- c(Math = 80, English = 75, Science = 90)

marks["Math"]
names(marks)

# 14. Character Vector

students <- c("Anmol", "Ram", "Sita")

toupper(students)
tolower(students)

# 15. Logical Vector

passed <- c(TRUE, FALSE, TRUE, TRUE)

passed
any(passed)        # TRUE if at least one is TRUE
all(passed)        # TRUE if all are TRUE

# 16. Missing Values

data <- c(10, 20, NA, 40)

is.na(data)
sum(data, na.rm = TRUE)
mean(data, na.rm = TRUE)

# 17. Vector Comparison

marks <- c(45, 65, 80, 35, 90)

marks >= 50
marks[marks >= 50]

# 18. Membership

10 %in% c(5, 10, 15)
20 %in% c(5, 10, 15)

# 19. Mathematical Functions

x <- c(1.5, 4.7, 9.2)

abs(x)
sqrt(x)
round(x)
ceiling(x)
floor(x)
log(x)

# 20. Type Conversion

x <- c("10", "20", "30")

as.numeric(x)
as.integer(x)
as.character(x)

# 21. Practical Example

student_marks <- c(78, 85, 67, 92, 55)

mean(student_marks)
max(student_marks)
min(student_marks)

student_marks[student_marks >= 60]

# Quick Reference

# c()       -> Create vector

# length()  -> Number of elements

# typeof()  -> Data type

# []        -> Access elements

# sum()     -> Total

# mean()    -> Average

# min()     -> Minimum

# max()     -> Maximum

# sort()    -> Sort values

# unique()  -> Remove duplicates

# which()   -> Find positions

# seq()     -> Create sequence

# rep()     -> Repeat values

# Key Point:

# R vectors normally contain values of the same basic type.

# Indexing starts from 1.

# Vector operations can be performed directly without loops.

