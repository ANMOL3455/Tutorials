#include <stdio.h>
int main(void) { int age; float temp; double salary; char initial; printf("Age: "); scanf("%d",&age); printf("Temperature: "); scanf("%f",&temp); printf("Salary: "); scanf("%lf",&salary); printf("Initial: "); scanf(" %c",&initial); printf("%d %.2f %.2f %c\n",age,temp,salary,initial); return 0; }
