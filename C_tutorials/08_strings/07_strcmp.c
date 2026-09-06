#include <stdio.h>
#include <string.h>
int main(void){char a[50],b[50];scanf("%49s%49s",a,b);int r=strcmp(a,b);puts(r==0?"Equal":r<0?"First comes before second":"First comes after second");return 0;}
