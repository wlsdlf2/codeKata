N = int(input())
for i in range(1, N + 1):
    num_str = str(i)

    cnt = 0
    for ch in num_str:
        if ch == '3' or ch == '6' or ch == '9':
            cnt += 1

    if cnt == 0:
        print(i, end=" ")
    else:
        print('-' * cnt, end=" ")