#include <stdio.h>
int main(void){FILE*f=fopen("characters.txt","w");if(!f)return 1;const char*s="C file handling\n";for(int i=0;s[i];i++)fputc(s[i],f);fclose(f);return 0;}
