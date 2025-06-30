#define _CRT_SECURE_NO_WARNINGS
#include <string.h>
#include <stdio.h>

int front = -1;
int q[10000];
int rear = -1;
void push(int item);
int frontF();
int back();
int pop();
int size();
int empty();


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
		else if (strcmp(type, "front") == 0) {
			printf("%d\n", frontF());
		}
		else if (strcmp(type, "back") == 0) {
			printf("%d\n", back());
		}
	}



	
	return 0;
}

void push(int item) {
	q[++rear] = item;
}
int pop() {
	
	if (front == rear)
		return -1;
		
	return q[++front];

}
int size() {
	return rear-front;
}
int empty() {
	if (rear==front)
		return 1;
	return 0;
}
int frontF() {
	if (empty())
		return -1;
	return q[front+1];

}
int back() {
	if (rear == front)
		return -1;
	return q[rear];
}
