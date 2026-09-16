# ============================================================
# R PROGRAMMING - VARIABLES
# File: 02_variables.R
# ============================================================

# A variable is a name used to store a value.

# Assignment operators in R:
# <- 
# =
# ->

# The most commonly used assignment operator is <-

# ------------------------------------------------------------
# CREATING VARIABLES
# ------------------------------------------------------------

name <- "Anmol"
age <- 19
height <- 5.5

print(name)
print(age)
print(height)

# ------------------------------------------------------------
# MULTIPLE VARIABLES
# ------------------------------------------------------------

a <- 10
b <- 20
c <- 30

print(a)
print(b)
print(c)

# ------------------------------------------------------------
# USING VARIABLES IN CALCULATIONS
# ------------------------------------------------------------

x <- 10
y <- 5

sum <- x + y
difference <- x - y
product <- x * y
division <- x / y

print(sum)
print(difference)
print(product)
print(division)

# ------------------------------------------------------------
# VARIABLE NAMING RULES
# ------------------------------------------------------------

# Valid:
student_name <- "Ram"
studentAge <- 20
marks1 <- 80

# Invalid:
# 1student <- 20
# student-name <- "Ram"

# Variable names should not begin with a number.

# ------------------------------------------------------------
# CHECKING A VARIABLE
# ------------------------------------------------------------

marks <- 85

print(marks)

# class() tells us the class/type of an object.

print(class(marks))
