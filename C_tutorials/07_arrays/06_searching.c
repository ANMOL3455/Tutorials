#include <stdio.h>
int main(void){int a[]={12,5,19,7,3,10},x;scanf("%d",&x);int pos=-1;for(int i=0;i<6;i++)if(a[i]==x){pos=i;break;}printf("%d\n",pos);return 0;}
