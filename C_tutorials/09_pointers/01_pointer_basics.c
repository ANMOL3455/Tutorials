#include <stdio.h>
int main(void){int n=42,*p=&n;printf("n=%d address=%p value=%d\n",n,(void*)p,*p);return 0;}
