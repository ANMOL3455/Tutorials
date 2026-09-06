#include <stdio.h>
#include <string.h>
int main(void){char s[100];fgets(s,sizeof s,stdin);s[strcspn(s,"\n")]=0;for(size_t i=strlen(s);i>0;i--)putchar(s[i-1]);puts("");return 0;}
