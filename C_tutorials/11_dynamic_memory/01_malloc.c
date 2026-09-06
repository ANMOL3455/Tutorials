#include <stdio.h>
#include <stdlib.h>
int main(void){int n;scanf("%d",&n);if(n<=0)return 1;int*a=malloc((size_t)n*sizeof*a);if(!a){perror("malloc");return 1;}for(int i=0;i<n;i++)a[i]=i+1;for(int i=0;i<n;i++)printf("%d ",a[i]);puts("");free(a);return 0;}
