#include <stdio.h>
int main(void){int n;unsigned long long a=0,b=1;scanf("%d",&n);if(n<1||n>93)return 1;for(int i=0;i<n;i++){printf("%llu ",a);unsigned long long x=a+b;a=b;b=x;}puts("");return 0;}
