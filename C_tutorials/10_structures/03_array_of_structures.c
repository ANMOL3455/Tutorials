#include <stdio.h>
struct Student{char name[30];int marks;};
int main(void){struct Student s[3]={{"Anmol",90},{"Ram",82},{"Sita",95}};for(int i=0;i<3;i++)printf("%s %d\n",s[i].name,s[i].marks);return 0;}
