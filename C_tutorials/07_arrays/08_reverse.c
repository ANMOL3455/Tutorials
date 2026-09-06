#include <stdio.h>
int main(void){int a[]={1,2,3,4,5,6};for(int l=0,r=5;l<r;l++,r--){int t=a[l];a[l]=a[r];a[r]=t;}for(int i=0;i<6;i++)printf("%d ",a[i]);puts("");return 0;}
