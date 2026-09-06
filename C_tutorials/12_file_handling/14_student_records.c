#include <stdio.h>
#define FILE_NAME "student_records.dat"
typedef struct{int id;char name[50];float marks;} Student;
void add_student(void){Student s;FILE*f=fopen(FILE_NAME,"ab");if(!f){perror("fopen");return;}printf("ID: ");if(scanf("%d",&s.id)!=1){fclose(f);return;}printf("Name: ");scanf(" %49[^\n]",s.name);printf("Marks: ");if(scanf("%f",&s.marks)!=1){fclose(f);return;}if(fwrite(&s,sizeof s,1,f)!=1)perror("fwrite");else puts("Saved.");fclose(f);}
void list_students(void){Student s;FILE*f=fopen(FILE_NAME,"rb");if(!f){puts("No records yet.");return;}while(fread(&s,sizeof s,1,f)==1)printf("ID:%d Name:%s Marks:%.2f\n",s.id,s.name,s.marks);fclose(f);}
int main(void){int c;while(1){puts("1 Add  2 List  0 Exit");if(scanf("%d",&c)!=1)return 1;if(c==1)add_student();else if(c==2)list_students();else if(c==0)break;else puts("Invalid choice.");}return 0;}
