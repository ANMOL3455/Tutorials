#include <stdio.h>
struct Book{char title[100];double price;};
int main(void){struct Book b;scanf(" %99[^\n]",b.title);scanf("%lf",&b.price);printf("%s %.2f\n",b.title,b.price);return 0;}
