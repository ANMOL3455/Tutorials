df <- data.frame(
  name = c("anmol", "ram", "hari"),
  marks = c(45, 56, 78),
  grade = c("A", "B", "C")
)

print(df)

df$name[1]
df[2, 3]
df[2, ]
df[, 2]
df[, c("name", "marks")]

df$name[1] <- "sita"
df$marks[2] <- 65
df$age <- c(20, 21, 22)

print(df)

dim(df)
nrow(df)
ncol(df)
names(df)

mean(df$marks)
median(df$marks)
sd(df$marks)
quantile(df$marks)
var(df$marks)
max(df$marks)
min(df$marks)

df[df$marks > 50, ]
df[df$marks == max(df$marks), ]
df[df$grade == "B", ]

df[order(df$marks), ]
df[order(df$marks, decreasing = TRUE), ]

age <- c(23, 24, 25)
gender <- c("male", "female", "male")
hello <- list("anmol", 23, "b")

df2 <- data.frame(age, gender, hello)

print(df2)

all <- list(
  df2 = data.frame(age, gender),
  df3 = data.frame(gender, age)
)

print(all)

students <- data.frame(
  name = c("Anmol", "Ram", "Hari", "Sita"),
  marks = c(65, 78, 45, 89),
  grade = c("B", "A", "C", "A")
)

print(students)

students$marks[3] <- 55
students$age <- c(20, 21, 20, 22)

students[students$marks > 60, ]

students[order(students$marks), ]

mean(students$marks)
max(students$marks)
min(students$marks)

students[students$marks == max(students$marks), ]

students[, c("name", "marks")]

students <- rbind(
  students,
  data.frame(
    name = "Gita",
    marks = 72,
    grade = "B",
    age = 21
  )
)

print(students)