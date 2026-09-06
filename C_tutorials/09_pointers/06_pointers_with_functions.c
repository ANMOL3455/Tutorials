#include <stdio.h>
void add_ten(int*p){*p+=10;}
int main(void){int n=5;add_ten(&n);printf("%d\n",n);return 0;}
