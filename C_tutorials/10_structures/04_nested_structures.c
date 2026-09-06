#include <stdio.h>
struct Date{int day,month,year;};struct Student{char name[30];struct Date birth;};
int main(void){struct Student s={"Anmol",{10,5,2007}};printf("%s %02d/%02d/%04d\n",s.name,s.birth.day,s.birth.month,s.birth.year);return 0;}
