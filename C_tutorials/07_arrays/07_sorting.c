#include <stdio.h>
int main(void){int a[]={64,25,12,22,11,90};for(int i=0;i<5;i++)for(int j=0;j<5-i;j++)if(a[j]>a[j+1]){int t=a[j];a[j]=a[j+1];a[j+1]=t;}for(int i=0;i<6;i++)printf("%d ",a[i]);puts("");return 0;}
