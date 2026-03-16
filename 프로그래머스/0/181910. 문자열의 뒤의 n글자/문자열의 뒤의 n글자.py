def solution(my_string, n):
    n = len(my_string) - n
    result = ""
    for i in range(n,len(my_string)):
        result += my_string[i]
    return result