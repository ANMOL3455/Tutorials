#include <stdio.h>
int main(void) { int id; char grade; float marks; printf("Enter ID grade marks: "); if(scanf("%d %c %f",&id,&grade,&marks)!=3) return 1; printf("ID=%d Grade=%c Marks=%.2f\n",id,grade,marks); return 0; }
