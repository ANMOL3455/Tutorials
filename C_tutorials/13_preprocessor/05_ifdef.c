#include <stdio.h>
#define DEBUG
int main(void) {
#ifdef DEBUG
    puts("Debug enabled");
#else
    puts("Debug disabled");
#endif
    return 0;
}
