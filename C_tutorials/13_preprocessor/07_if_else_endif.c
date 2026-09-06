#include <stdio.h>
#define AGE 19
int main(void) {
#if AGE >= 18
    puts("Adult configuration");
#else
    puts("Minor configuration");
#endif
    return 0;
}
