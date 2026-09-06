#include <stdio.h>
int main(void){int a[6];for(int i=0;i<6;i++)scanf("%d",&a[i]);int mx=a[0],mn=a[0];for(int i=1;i<6;i++){if(a[i]>mx)mx=a[i];if(a[i]<mn)mn=a[i];}printf("Max=%d Min=%d\n",mx,mn);return 0;}
