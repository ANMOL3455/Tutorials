#include <stdio.h>
#include <stdlib.h>
int main(void){int*p=malloc(sizeof*p);if(!p)return 1;*p=123;printf("%d\n",*p);free(p);p=NULL;puts("Memory released.");return 0;}
