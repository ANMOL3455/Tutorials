#include <stdio.h>
int main(void){int n,prime=1;scanf("%d",&n);if(n<2)prime=0;for(int i=2;prime&&i<=n/i;i++)if(n%i==0)prime=0;printf("%d is %sprime.\n",n,prime?"":"not ");return 0;}
