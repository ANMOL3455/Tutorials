#include <stdio.h>
#include <string.h>
int main(void){char s[200];if(fgets(s,sizeof s,stdin)){s[strcspn(s,"\n")]=0;puts(s);}return 0;}
