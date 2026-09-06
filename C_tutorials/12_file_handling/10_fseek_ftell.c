#include <stdio.h>
int main(void){FILE*f=fopen("example.txt","r");if(!f)return 1;if(fseek(f,0,SEEK_END)!=0){fclose(f);return 1;}long pos=ftell(f);printf("Position at end: %ld\n",pos);fclose(f);return 0;}
