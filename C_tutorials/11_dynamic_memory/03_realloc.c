#include <stdio.h>
#include <stdlib.h>
int main(void){int n=3;int*a=malloc(n*sizeof*a);if(!a)return 1;for(int i=0;i<n;i++)a[i]=i+1;int new_n=6;int*t=realloc(a,new_n*sizeof*a);if(!t){free(a);return 1;}a=t;for(int i=n;i<new_n;i++)a[i]=(i+1)*10;for(int i=0;i<new_n;i++)printf("%d ",a[i]);puts("");free(a);return 0;}
