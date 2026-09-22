# Creating a 2 x 2 matrix
mat <- matrix(c(1, 2, 3, 4), nrow = 2, ncol = 2, byrow = TRUE)
print(mat)

# Creating a 2 x 4 matrix
# By default, R fills the matrix column by column
mat2 <- matrix(c(1, 2, 3, 4, 5, 6, 7, 8), nrow = 2, ncol = 4)
print(mat2)


# Finding the determinant
# Determinant can only be calculated for a square matrix
det(mat)


# Accessing elements of a matrix

# Syntax: matrix[row, column]

print(mat[2, 1])   # Element at row 2, column 1

print(mat[2, ])    # All elements of row 2

print(mat[, 1])    # All elements of column 1


# Finding the dimensions
# Returns number of rows and columns
print(dim(mat))


# Removing data

mat[-2, ]    # Removes row 2
mat[, -2]    # Removes column 2


# Built-in matrix functions

solve(mat)   # Finds the inverse of the matrix
t(mat)       # Transpose of the matrix

min(mat)     # Minimum value
max(mat)     # Maximum value
median(mat)  # Median value
mean(mat)    # Mean value
rowMeans(mat) #Mean value of rows
colMeans(mat) #Mean of column

#use of any and all
any(mat < 3)
all(mat < 4)



# Singular and non-singular matrix
# A matrix is singular if its determinant is 0.
# A matrix is non-singular if its determinant is not 0.
# An inverse can only be found for a non-singular matrix.


# Task
# Create a matrix with 8 elements, 4 rows and 2 columns

task <- matrix(
  c(1, 2, 3, 4, 5, 6, 7, 8),
  nrow = 4,
  ncol = 2,
  byrow = TRUE
)

print(task)


# Add 5 to every element
task + 5


# Find the dimensions of the transpose
dim(t(task))


# Find maximum, minimum and mean
max(task)
min(task)
mean(task)


# Accessing elements

task[2, 1]   # Row 2, column 1

task[, 2]    # All elements of column 2

task[2, ]    # All elements of row 2

task[2, 2]   # Row 2, column 2


# Changing an element

task[2, 2] <- 45

print(task)


#accessing the diagonal
sum(diag(mat))

#binding the column and rows
mat=rbind(mat,c(12,23))
cbind(mat,c(22,34,0))

#arthematics in matrix
x <- matrix(c(1,2,3,4),nrow=2,ncol=2)
y <- matrix(c(5,6,7,8),nrow=2,ncol=2)
print(x%*%y)  # multiplication
print(x+y)    #addition
print(x-y)    #Difference



