# Create a list containing different types of data
# A list can store vectors, numbers, matrices, logical values,
# and even other lists at the same time
ex_list <- list(
  name = c("milan", "haridev"),
  age = 23,
  mat = matrix(
    c(1, 2, 3, 4),
    nrow = 2,
    ncol = 2
  ),
  ispass = TRUE,
  
  # A list inside another list is called a nested list
  new = list(
    name = c("saras", "hari"),
    age = 23,
    mat = matrix(
      c(1, 2, 3, 4),
      nrow = 2,
      ncol = 2
    ),
    ispass = TRUE
  )
)

# Display the complete list
print(ex_list)

# Access the second element of the list
# Single square brackets [ ] return the element as a list
print(ex_list[2])

# Check the class of the extracted element
print(class(ex_list[2]))

# Check the data type of the extracted element
print(typeof(ex_list[2]))

# Access the first element of the list
# [[ ]] extracts the actual value instead of returning a list
# [1] then accesses the first value inside that element
print(class(ex_list[[1]][1]))

# Access the value in row 2, column 2 of the matrix
# $mat accesses the matrix stored under the name "mat"
ex_list$mat[2, 2]

# Add a new element called "gender" to the list
ex_list$gender <- c("male", "female")

# Access the first element of the nested list "new"
# $new accesses the nested list
ex_list$new[1]


# Create a list containing multiple nested lists
# Each element (one, two, three, four) represents another list
another <- list(
  one = list(
    name = "anmol",
    age = 23,
    mat = matrix(
      c(1, 2, 3, 4),
      nrow = 2,
      ncol = 2
    ),
    ispass = TRUE
  ),
  
  two = list(
    name = "hari",
    age = 30,
    mat = matrix(
      c(1, 2, 3, 4),
      nrow = 2,
      ncol = 2
    ),
    ispass = TRUE
  ),
  
  three = list(
    name = "ram",
    age = 24,
    mat = matrix(
      c(1, 2, 3, 4),
      nrow = 2,
      ncol = 2
    ),
    ispass = TRUE
  ),
  
  four = list(
    name = "manish",
    age = 45,
    mat = matrix(
      c(1, 2, 3, 4),
      nrow = 2,
      ncol = 2
    ),
    ispass = TRUE
  )
)
# Check whether ANY of the age values are greater than 20
# any() returns TRUE if at least one condition is TRUE
any(another$age > 20)