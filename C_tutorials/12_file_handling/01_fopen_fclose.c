#include <stdio.h>
int main(void){FILE*f=fopen("example.txt","w");if(!f){perror("fopen");return 1;}puts("Opened successfully.");fclose(f);return 0;}
