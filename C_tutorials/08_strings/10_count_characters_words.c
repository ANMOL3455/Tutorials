#include <stdio.h>
#include <ctype.h>
int main(void){char s[500];int chars=0,words=0,in=0;if(!fgets(s,sizeof s,stdin))return 1;for(int i=0;s[i];i++){if(s[i]!='\n')chars++;if(isspace((unsigned char)s[i]))in=0;else if(!in){words++;in=1;}}printf("Characters=%d Words=%d\n",chars,words);return 0;}
