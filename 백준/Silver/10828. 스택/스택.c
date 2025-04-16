#define _CRT_SECURE_NO_WARNINGS
#include <string.h>
#include <stdio.h>

void push(int item);
int pop();
int size();
int empty();
int top = -1;
int stk[10000];

int main() {
	char type[20];
	int n, item;
	
	scanf("%d", &n);
	for (int i = 0; i < n; i++) {
		scanf("%s", type);
		if (strcmp(type, "push") == 0) {
			scanf("%d", &item);
			push(item);
		}
		else if (strcmp(type, "pop") == 0)
			printf("%d\n", pop());
		else if (strcmp(type, "size") == 0)
			printf("%d\n", size());
		else if (strcmp(type, "empty") == 0)
			printf("%d\n", empty());
		else if (strcmp(type, "top") == 0) {
			if (top < 0)
				printf("-1\n");
			else {
				printf("%d\n", stk[top]);
			}
		}



	}
	return 0;
}

void push(int item) {
	stk[++top] = item;
}
int pop() {
	if (top<0)
		return -1;
	return stk[top--];

}
int size() {
	return top + 1;
}
int empty() {
	if (top<=-1)
		return 1;
	return 0;
}