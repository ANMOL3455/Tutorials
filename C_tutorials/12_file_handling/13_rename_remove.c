#include <stdio.h>
int main(void){FILE*f=fopen("old_name.txt","w");if(!f)return 1;fputs("Temporary",f);fclose(f);if(rename("old_name.txt","new_name.txt")!=0)return 1;printf("Renamed.\n");if(remove("new_name.txt")!=0)return 1;puts("Removed.");return 0;}
