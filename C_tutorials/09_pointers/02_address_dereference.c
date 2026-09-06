#include <stdio.h>
int main(void){int x=25,*p=&x;printf("%p %d\n",(void*)&x,*p);*p=50;printf("x=%d\n",x);return 0;}
