#include <stdio.h>
typedef struct{char name[30];int age;} Person;
int main(void){Person p={"Anmol",19};printf("%s %d\n",p.name,p.age);return 0;}
