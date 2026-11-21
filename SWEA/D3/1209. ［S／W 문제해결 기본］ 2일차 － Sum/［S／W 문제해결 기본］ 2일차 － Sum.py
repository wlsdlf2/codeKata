for _ in range(10):
    t = int(input())
    board = [list(map(int, input().split())) for _ in range(100)]
    L = len(board)

    max_sum = 0
    for i in range(L):
        sum = 0
        for j in range(L):
            sum += board[i][j]

        max_sum = max(max_sum, sum)

    for j in range(L):
        sum = 0
        for i in range(L):
            sum += board[i][j]

        max_sum = max(max_sum, sum)

    sumleft = 0
    sumright = 0
    for i in range(L):
        sumleft += board[i][i]
        sumright += board[L - i - 1][L - i - 1]

    max_sum = max(max_sum, sumleft, sumright)

    print(f"#{t} {max_sum}")