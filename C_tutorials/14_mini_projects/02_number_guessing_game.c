#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int main(void){int g,attempts=0;srand((unsigned)time(NULL));int secret=rand()%100+1;puts("Guess 1-100");do{if(scanf("%d",&g)!=1)return 1;attempts++;if(g<secret)puts("Too low.");else if(g>secret)puts("Too high.");else printf("Correct in %d attempts.\n",attempts);}while(g!=secret);return 0;}
