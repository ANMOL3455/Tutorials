#include <stdio.h>
int main(void){FILE*f=fopen("example.txt","r");if(!f)return 1;int a=fgetc(f);rewind(f);int b=fgetc(f);printf("%c %c\n",a,b);fclose(f);return 0;}
