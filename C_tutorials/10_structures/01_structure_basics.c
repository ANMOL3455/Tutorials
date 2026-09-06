#include <stdio.h>
struct Student{char name[50];int age;float marks;};
int main(void){struct Student s={"Anmol",19,88.5f};printf("%s %d %.2f\n",s.name,s.age,s.marks);return 0;}
