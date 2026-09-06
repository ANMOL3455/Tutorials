#include <stdio.h>
int main(void){int a[]={10,20,30,40,50},*p=a;for(int i=0;i<5;i++)printf("%d ",*(p+i));puts("");return 0;}
