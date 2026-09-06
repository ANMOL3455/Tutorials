#include <stdio.h>
#define VERSION 2
int main(void) {
#if VERSION == 2
    puts("Version 2");
#else
    puts("Other version");
#endif
    return 0;
}
