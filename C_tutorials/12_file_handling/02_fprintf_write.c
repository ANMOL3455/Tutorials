#include <stdio.h>
int main(void){FILE*f=fopen("students.txt","w");if(!f)return 1;fprintf(f,"Anmol 19 88.50\nRam 20 82.00\n");fclose(f);return 0;}
