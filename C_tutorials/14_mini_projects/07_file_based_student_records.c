#include <stdio.h>
#define FILE_NAME "students.dat"
typedef struct{int id;char name[50];float marks;} Student;
void add(void){Student s;FILE*f=fopen(FILE_NAME,"ab");if(!f){perror("fopen");return;}scanf("%d",&s.id);scanf(" %49[^\n]",s.name);scanf("%f",&s.marks);if(fwrite(&s,sizeof s,1,f)!=1)perror("fwrite");fclose(f);}
void list(void){Student s;FILE*f=fopen(FILE_NAME,"rb");if(!f){puts("No records yet.");return;}while(fread(&s,sizeof s,1,f)==1)printf("ID:%d Name:%s Marks:%.2f\n",s.id,s.name,s.marks);fclose(f);}
int main(void){int c;while(1){puts("1 Add 2 List 0 Exit");scanf("%d",&c);if(c==1)add();else if(c==2)list();else if(c==0)break;else puts("Invalid.");}return 0;}
