#include <stdio.h>
typedef struct{double l,w;} Rectangle;
double area(Rectangle r){return r.l*r.w;}
int main(void){Rectangle r={8,4};printf("%.2f\n",area(r));return 0;}
