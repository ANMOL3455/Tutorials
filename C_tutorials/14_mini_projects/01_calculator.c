#include <stdio.h>
int main(void){double a,b,r;char op;if(scanf("%lf %c %lf",&a,&op,&b)!=3)return 1;switch(op){case '+':r=a+b;break;case '-':r=a-b;break;case '*':r=a*b;break;case '/':if(b==0){puts("Cannot divide by zero.");return 1;}r=a/b;break;default:puts("Unknown operator.");return 1;}printf("Result=%.2f\n",r);return 0;}
