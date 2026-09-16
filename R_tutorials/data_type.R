# ============================================================
# R PROGRAMMING - DATA TYPES
# File: 03_data_types.R
# ============================================================

# Common basic data types in R:
#
# 1. Numeric
# 2. Integer
# 3. Character
# 4. Logical
# 5. Complex

# ------------------------------------------------------------
# 1. NUMERIC
# ------------------------------------------------------------

# Numbers containing decimal values are generally numeric.

price <- 99.50

print(price)
print(class(price))

# ------------------------------------------------------------
# 2. INTEGER
# ------------------------------------------------------------

# Add L after a number to explicitly create an integer.

age <- 19L

print(age)
print(class(age))

# ------------------------------------------------------------
# 3. CHARACTER
# ------------------------------------------------------------

# Character data is written inside quotes.

name <- "Anmol"
college <- "LBEF"

print(name)
print(college)

print(class(name))

# ------------------------------------------------------------
# 4. LOGICAL
# ------------------------------------------------------------

# Logical values are:
# TRUE
# FALSE

is_student <- TRUE
is_working <- FALSE

print(is_student)
print(is_working)

print(class(is_student))

# ------------------------------------------------------------
# 5. COMPLEX
# ------------------------------------------------------------

# Complex numbers contain an imaginary part.

z <- 5 + 3i

print(z)
print(class(z))

# ------------------------------------------------------------
# CHECKING DATA TYPE
# ------------------------------------------------------------

x <- 100

print(typeof(x))
print(class(x))
