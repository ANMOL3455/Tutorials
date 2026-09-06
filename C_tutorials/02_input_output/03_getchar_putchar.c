#include <stdio.h>
int main(void) { int ch; printf("Enter a character: "); ch=getchar(); if(ch!=EOF){ printf("You entered: "); putchar(ch); putchar('\n'); } return 0; }
