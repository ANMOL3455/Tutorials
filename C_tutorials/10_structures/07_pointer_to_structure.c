#include <stdio.h>
struct Student{char name[30];int marks;};
int main(void){struct Student s={"Anmol",91};struct Student*p=&s;printf("%s %d\n",p->name,p->marks);return 0;}
