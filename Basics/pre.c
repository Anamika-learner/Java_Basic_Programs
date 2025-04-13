#include <stdio.h>
int main() {
char a = '*';
for(int i=1; i<=3; i++) {
printf("%c\n",a);
for(int j=1; j<=i; j++) {
printf("%d ",i);
}
printf("\n");
}
return 0;
}