#include <stdio.h>
#define MAX_TASKS 100
typedef struct{char text[120];int done;} Task;
int main(void){Task t[MAX_TASKS];int n=0,c;while(1){puts("1 Add 2 List 3 Complete 0 Exit");if(scanf("%d",&c)!=1)return 1;if(c==1){if(n>=MAX_TASKS)continue;scanf(" %119[^\n]",t[n].text);t[n].done=0;n++;}else if(c==2){for(int i=0;i<n;i++)printf("%d [%c] %s\n",i+1,t[i].done?'X':' ',t[i].text);}else if(c==3){int x;scanf("%d",&x);if(x>=1&&x<=n)t[x-1].done=1;}else if(c==0)break;}return 0;}
