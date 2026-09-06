#include <stdio.h>
int main(void){int a[]={10,20,30,40,50},b[5];FILE*f=fopen("numbers.bin","wb");if(!f)return 1;if(fwrite(a,sizeof a[0],5,f)!=5){fclose(f);return 1;}fclose(f);f=fopen("numbers.bin","rb");if(!f)return 1;if(fread(b,sizeof b[0],5,f)!=5){fclose(f);return 1;}fclose(f);for(int i=0;i<5;i++)printf("%d ",b[i]);puts("");return 0;}
