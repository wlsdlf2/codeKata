from collections import deque

def bfs(start_r, start_c, current_move, number_str):
    queue = deque([(start_r, start_c, current_move, number_str)])

    dr = [-1, 1, 0, 0]
    dc = [0, 0, -1, 1]

    while queue:
        r, c, m, str = queue.popleft()

        if m == 6:
            numbers.add(str)
            continue

        for d in range(4):
            nr = r + dr[d]
            nc = c + dc[d]

            if 0 <= nr < 4 and 0 <= nc < 4:
                queue.append((nr, nc, m + 1, str + board[nr][nc]))

T = int(input())
for t in range(T):
    board = [input().split() for _ in range(4)]

    numbers = set()
    for i in range(4):
        for j in range(4):
            bfs(i, j, 0, board[i][j])

    print(f"#{t + 1} {len(numbers)}")