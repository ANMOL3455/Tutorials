#include <stdio.h>
int main(void){FILE*in=fopen("input.txt","r"),*out=fopen("copy.txt","w");char line[256];if(!in||!out){if(in)fclose(in);if(out)fclose(out);return 1;}while(fgets(line,sizeof line,in))fputs(line,out);fclose(in);fclose(out);return 0;}
