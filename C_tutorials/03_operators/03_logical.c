#include <stdio.h>
int main(void) { int age=20,has_id=1; printf("AND=%d OR=%d NOT=%d\n",age>=18&&has_id,age<18||has_id,!has_id); return 0; }
