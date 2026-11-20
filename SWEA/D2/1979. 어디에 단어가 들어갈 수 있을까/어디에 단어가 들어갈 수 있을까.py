T = int(input())
for t in range(T):
    N, K = map(int, input().split())
    board = [input().split() for _ in range(N)]

    answer = 0
    for i in range(N):
        count = 0
        for j in range(N):
            if board[i][j] == '1':
                count += 1
            else:
                if count == K:
                    answer += 1
                count = 0
        if count == K:
            answer += 1

    for j in range(N):
        count = 0
        for i in range(N):
            if board[i][j] == '1':
                count += 1
            else:
                if count == K:
                    answer += 1
                count = 0
        if count == K:
            answer += 1

    print(f"#{t + 1} {answer}")