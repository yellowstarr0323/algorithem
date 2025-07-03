//#define _CRT_SECURE_NO_WARNINGS
//#include <stdio.h>
//#include <stdlib.h>
//#include <string.h>
//
//char* solution(const char* my_string, const char* overwrite_string, int s) {
//    int len = strlen(my_string);  
//    char* answer = (char*)malloc((len + 1) * sizeof(char));  
//    
//    if (answer == NULL) {
//        return NULL;  
//    }
//
//    strcpy(answer, my_string); 
//
//   
//    for (int i = 0; i < strlen(overwrite_string); i++) {
//        answer[s + i] = overwrite_string[i];
//    }
//
//    return answer; 
//}
//
//int main(void) {
//    char my_string[1000];
//    char over_string[1000];
//    int s;
//
//   
//    scanf("%s %s %d", my_string, over_string, &s);
//
//    
//    char* result = solution(my_string, over_string, s);
//
//    if (result == NULL) {
//        printf("메모리 할당 실패!\n");
//        return 1;
//    }
//
//    printf("%s\n", result); 
//
//    
//    free(result);
//    return 0;
//}
//#define _CRT_SECURE_NO_WARNINGS
//#include <stdio.h>
//#include <string.h>
//#define LEN_INPUT1 11
//#define LEN_INPUT2 11
//
//int main(void) {
//    char s1[LEN_INPUT1];
//    char s2[LEN_INPUT2];
//    scanf("%s %s", s1, s2);
//    int len = strlen(s1);
//    for (int i = len; i <= strlen(s1) + strlen(s2); i++) {
//        s1[i + 1] = s2[i - len];
//        printf("%c ", s1[i]);
//    }
//
//    printf("%s", s1);
//
//
//    return 0;
////}]
//#define _CRT_SECURE_NO_WARNINGS
//#include <stdio.h>
//#include <stdlib.h>
//#include <string.h>
//
//// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
//char* solution(const char* str1, const char* str2) {
//    int len1 = strlen(str1);
//    int len2 = strlen(str2);
//
//    // 결과 문자열을 위한 메모리 할당 (최대 길이만큼)
//    char* answer = (char*)malloc(sizeof(char) * (len1 + len2 + 1));  // +1은 null 문자 때문에
//
//    int i = 0, j = 0, k = 0;
//
//    // 두 문자열을 번갈아가며 섞기
//    while (i < len1 || j < len2) {
//        if (i < len1) {
//            answer[k++] = str1[i++];
//        }
//        if (j < len2) {
//            answer[k++] = str2[j++];
//        }
//    }
//    
//    // 결과 문자열 끝에 널 문자 추가
//    answer[k] = '\0';
//
//    return answer;
//}
//
//int main() {
//    // 예시 입력
//    char str1[] = "aaaaa";
//    char str2[] = "bbbbb";
//
//    // 문자열 섞기 함수 호출
//    char* result = solution(str1, str2);
//
//    // 결과 출력
//    printf("%s\n", result);
//
//    // 동적 할당된 메모리 해제
//    free(result);
//
//    return 0;
//}
//#define _CRT_SECURE_NO_WARNINGS
//#include <stdio.h>
//#include <stdbool.h>
//#include <stdlib.h>
//#include <string.h>
//// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
//char* solution(const char* my_string, int k) {
//    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
//    int len = strlen(my_string);
//    char* answer = (char*)malloc(len * k + 1);
//
//    for (int i = 0; i < strlen(my_string); i++) {
//        answer[i] = my_string[i];
//
//    }
//    answer[0] = '\0';
//    for (int i = 0; i < k; i++){
//        strcat(answer, my_string);
//    }
//    
//    return answer;
//}
//
//int main() {
//    const char* str = "string";
//
//    char* result = solution(str, 3);
//    printf("%s",result);
//    free(result);
//    return 0;
//}
//#include <stdio.h>
//#include <stdbool.h>
//#include <stdlib.h>
//int combine(int a, int b) {
//    int size = 1;
//    while (size <= b) {
//        size *= 10;
//    }
//    return size * a + b;
//}
//int solution(int a, int b) {
//    int answer = 0;
//    int plus, calcu;
//    plus = combine(a, b);
//    calcu = cal(a, b);
//    if (plus > combine)
//        answer = plus;
//    else
//        answer = calcu;
//    return answer;
//}
//int cal(int a, int b) {
//    return 2 * a * b;
//}

//#define _CRT_SECURE_NO_WARNINGS
//#include <stdio.h>
//#include <stdbool.h>
//#include <stdlib.h>
//#include <string.h>
//
//int combine(int a, int b) {
//    return a * 10 + b;
//}
//
//int times(int a, int b) {
//    return 2 * a * b;
//}
//
//int solution(int a, int b) {
//    int plus = combine(a, b);
//    int mul = times(a, b);
//
//    if (plus > mul) {
//        return plus;
//    }
//    else {
//        return mul;
//    }
//
//}
//
//int main() {
//    int a;
//    int b;
//    scanf("%d %d", &a, &b);
//
//    int result = solution(a, b);
//    printf("%d", result);
//
//    return 0;
//}
//#define _CRT_SECURE_NO_WARNINGS
//#include <stdio.h>
//
//int main() {
//	for (int i = 1; i <= 5; i++) {
//		for (int j = 1; j <= i; j++) {
//			printf("*");
//		}
//		printf("\n");
//	}
//
//
//}
//#define _CRT_SECURE_NO_WARNINGS
//#include <stdio.h>
//#include <stdbool.h>
//#include <stdlib.h>
//#include <string.h>
//// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
//char* solution(const char* code) {
//    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
//    char* answer = (char*)malloc(strlen(code) + 1);
//    int mode = 0;
//    char cod[100] = code;
//    int len = strlen(code);
//    for (int i = 0; i < len; i++) {
//        if (mode == 0) {
//            if (code[i] == 1)
//                mode = 1;
//
//            else if (i % 2 == 0)
//                strcat(answer, cod[i]);
//        }
//        else {
//            if (cod[i] == '1') { mode = 0; }
//            else if (i % 2 == 1)
//                strcat(answer, cod[i]);
//        }
//    }
//    return answer;
//}
//int main() {
//    int* answer = solution("abc1abc1abc");
//    free(answer);
//    return answer;
//}
//#include <stdio.h>
//#include <stdbool.h>
//#include <stdlib.h>
//
//// included_len은 배열 included의 길이입니다.
//int solution(int a, int d, bool included[], size_t included_len) {
//    int answer = 0;
//
//    int len = included_len;
//    int* values = (int*)malloc(sizeof(int) * len + 1);
//    values[0] = d;
//    for (int i = 1; i < len; i++) {
//        values[i] = 0;
//        printf("HELO");
//    }
//    for (int i = 1; i < len + 1; i++) {
//        values = values[i - 1] + a;
//        printf("%d\n", values[i]);
//    };
//    return answer;
//}
// 개미새끼 찾기 문제
//#define _CRT_SECURE_NO_WARNINGS
//#include <stdio.h>
//
//int main() {
//	int ants[11][11];
//	for (int i = 1; i < 11; i++) {
//		for (int j = 1; j < 11; j++) {
//			scanf("%d", &ants[i][j]);
//
//		}
//
//	}
//	int x = 2, y = 2;
//
//	while (1) {
//
//		if (ants[y][x] == 2)
//			break;
//
//
//		else if (ants[y][x + 1] != 1) {
//			ants[y][x] = 9;
//
//			x++;
//
//		}
//
//		else if (ants[y + 1][x] != 1) {
//			ants[y][x] = 9;
//
//			y++;
//
//		}
//		else break;
//
//	}
//
//	ants[y][x] = 9;
//	for (int i = 1; i < 11; i++) {
//		for (int j = 1; j < 11; j++) {
//			printf("%d ", ants[i][j]);
//
//		}
//		printf("\n");
//
//	}
//	return 0;
//}
//백준 11047

#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main() {
	int count=0,n, k,coins[10],temp;
	scanf("%d %d", &n, &k);
	
	for (int i = 1; i <=n; i++) {
		scanf("%d", &temp);
		coins[n - i]=temp;
		
	}
	for (int i = 0; i < n; i++) {
		
		if (k != 0) {
			if (k / coins[i])
				count += k / coins[i];
				k = k % coins[i];

		}
	}
	printf("%d", count);
}