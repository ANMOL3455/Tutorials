#include <stdio.h>
int main(void){FILE*f=fopen("log.txt","a");if(!f)return 1;fputs("New log entry.\n",f);fclose(f);return 0;}
