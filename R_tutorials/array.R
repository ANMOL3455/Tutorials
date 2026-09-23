# Create an array using the values from 1 to 9
# dim = c(3, 3) means 3 rows and 3 columns
collection <- array(
  c(1, 2, 3, 4, 5, 6, 7, 8, 9),
  dim = c(3, 3)
)

# Display the array
print(collection)


# Create a 3-dimensional array
# dim = c(2, 2, 3) means:
# 2 rows
# 2 columns
# 3 layers
#
# Total number of elements = 2 x 2 x 3 = 12
# Only 9 values are provided, so R repeats the values
# to fill all 12 positions
collection2 <- array(
  c(1, 2, 3, 4, 5, 6, 7, 8, 9),
  dim = c(2, 2, 3)
)

# Display the 3-dimensional array
print(collection2)


# Accessing values from a 3-dimensional array
# Syntax: array[row, column, layer]

# Access the value at row 2, column 2, layer 1
collection2[2, 2, 1]

# Access the value at row 1, column 1, layer 3
collection2[1, 1, 3]


# Convert the 3 x 3 array into a vector
# as.vector() removes the array dimensions
# and stores all the values as a single vector
conv <- as.vector(collection)

# Check the class of the original collection
# The result will be "matrix" because a 2-dimensional array
# is internally treated as a matrix in R
class(collection)

# Display the converted vector
print(conv)

# Check the data type of the converted vector
# Since the values are numbers, the result will be "double"
typeof(conv)