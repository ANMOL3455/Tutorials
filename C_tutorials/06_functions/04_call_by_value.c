#include <stdio.h>
void change(int x){x=100;}
int main(void){int n=10;change(n);printf("n=%d\n",n);return 0;}
