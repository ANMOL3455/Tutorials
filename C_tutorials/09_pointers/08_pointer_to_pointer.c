#include <stdio.h>
int main(void){int x=100,*p=&x,**pp=&p;printf("%d %d %d\n",x,*p,**pp);**pp=200;printf("%d\n",x);return 0;}
