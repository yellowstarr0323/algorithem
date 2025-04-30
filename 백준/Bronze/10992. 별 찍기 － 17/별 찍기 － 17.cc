#include<stdio.h>
int main(void) {
	int i, j, a;
	scanf("%d", &a);
	for (j = 1; j < a; j++) {
		printf(" ");
	}
	printf("*");
	printf("\n");
	for (j = 2; j < a; j++) {
		for (i = a; i > j; i--) {
			printf(" ");
		}
		printf("*");
		for (i = 1; i < (2 * j) - 2; i++) {
			printf(" ");
		}
		printf("*");
		printf("\n");

	}
	if (a != 1)
		for (j = 1; j < 2 * a; j++) {
			printf("*");
		}
	return 0;
}