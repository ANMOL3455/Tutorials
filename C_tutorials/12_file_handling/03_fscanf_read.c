#include <stdio.h>
int main(void){FILE*f=fopen("students.txt","r");char name[50];int age;float marks;if(!f){perror("fopen");return 1;}while(fscanf(f,"%49s %d %f",name,&age,&marks)==3)printf("%s %d %.2f\n",name,age,marks);fclose(f);return 0;}
