#include <stdio.h>
#include <string.h>
int main(void){char s[100];scanf("%99s",s);int ok=1;size_t n=strlen(s);for(size_t i=0;i<n/2;i++)if(s[i]!=s[n-1-i]){ok=0;break;}puts(ok?"Palindrome":"Not palindrome");return 0;}
