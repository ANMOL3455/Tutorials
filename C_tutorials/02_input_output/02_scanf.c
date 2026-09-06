#include <stdio.h>
int main(void) { int age; double height; printf("Age: "); if(scanf("%d",&age)!=1) return 1; printf("Height: "); if(scanf("%lf",&height)!=1) return 1; printf("Age=%d Height=%.2f\n",age,height); return 0; }
