#include <stdio.h>
#include <stdlib.h>
int main(void){size_t n;scanf("%zu",&n);if(n==0)return 1;double*a=malloc(n*sizeof*a);if(!a)return 1;double sum=0;for(size_t i=0;i<n;i++){if(scanf("%lf",&a[i])!=1){free(a);return 1;}sum+=a[i];}printf("Average=%.2f\n",sum/n);free(a);return 0;}
