#include <stdio.h>
#define SUBJECTS 5
int main(void){char name[50];float m[SUBJECTS],total=0;scanf(" %49[^\n]",name);for(int i=0;i<SUBJECTS;i++){scanf("%f",&m[i]);if(m[i]<0||m[i]>100)return 1;total+=m[i];}double avg=total/SUBJECTS;printf("%s Total=%.2f Average=%.2f\n",name,total,avg);if(avg>=80)puts("Grade A");else if(avg>=60)puts("Grade B");else if(avg>=50)puts("Grade C");else puts("Grade D");return 0;}
