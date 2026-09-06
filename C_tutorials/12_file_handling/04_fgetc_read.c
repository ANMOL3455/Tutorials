#include <stdio.h>
int main(void){FILE*f=fopen("example.txt","r");if(!f)return 1;int ch;while((ch=fgetc(f))!=EOF)putchar(ch);fclose(f);return 0;}
