#include <stdio.h>
#include <string.h>
#define MAX_CONTACTS 100
typedef struct{char name[50];char phone[30];} Contact;
int main(void){Contact c[MAX_CONTACTS];int n=0,ch;while(1){puts("1 Add 2 List 3 Search 0 Exit");if(scanf("%d",&ch)!=1)return 1;if(ch==1){if(n>=MAX_CONTACTS)continue;scanf(" %49[^\n]",c[n].name);scanf(" %29s",c[n].phone);n++;}else if(ch==2){for(int i=0;i<n;i++)printf("%d. %s - %s\n",i+1,c[i].name,c[i].phone);}else if(ch==3){char s[50];int found=0;scanf(" %49[^\n]",s);for(int i=0;i<n;i++)if(strcmp(c[i].name,s)==0){printf("%s - %s\n",c[i].name,c[i].phone);found=1;}if(!found)puts("Not found.");}else if(ch==0)break;else puts("Invalid.");}return 0;}
