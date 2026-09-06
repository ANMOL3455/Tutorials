#include <stdio.h>
int main(void) { int age,id; scanf("%d%d",&age,&id); if(age>=18){ if(id) puts("Entry allowed"); else puts("ID required"); } else puts("Under 18"); return 0; }
