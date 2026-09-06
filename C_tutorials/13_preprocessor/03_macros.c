#include <stdio.h>
#define SQUARE(x) ((x)*(x))
#define MAX(a,b) ((a)>(b)?(a):(b))
int main(void){printf("%d %d\n",SQUARE(6),MAX(6,9));return 0;}
