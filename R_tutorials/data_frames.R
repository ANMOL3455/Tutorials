# DATA FRAMES - BUILT-IN DATASETS

# List all built-in datasets
ls("package:datasets")


# MTCARS DATASET

# Display complete dataset
mtcars

# Display first 3 rows
head(mtcars, 3)

# Display last 2 rows
tail(mtcars, 2)

# Check structure
str(mtcars)

# Summary
summary(mtcars)

# Access a column
mtcars$mpg
mtcars$hp
mtcars$cyl

# Access specific row
mtcars[1, ]

# Access specific column
mtcars[, 1]

# Access specific value
mtcars[1, 1]

# Mean
mean(mtcars$mpg)

# Median
median(mtcars$hp)

# Minimum
min(mtcars$mpg)
min(mtcars$hp)

# Quantile
quantile(mtcars$cyl, probs = c(0.15, 0.45))

# Standard deviation
sd(mtcars$vs)

# Check class
class(mtcars)

# Check condition
mtcars$mpg == 45


# IRIS DATASET

# Display dataset
iris

# First 5 rows
head(iris)

# Last 5 rows
tail(iris)

# Structure
str(iris)

# Summary
summary(iris)

# Access columns
iris$Sepal.Length
iris$Sepal.Width
iris$Petal.Length
iris$Petal.Width
iris$Species

# Mean
mean(iris$Sepal.Length)

# Median
median(iris$Sepal.Width)

# Minimum
min(iris$Petal.Length)

# Maximum
max(iris$Petal.Length)

# Check class
class(iris)