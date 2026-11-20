from collections import deque

def bfs(start_r, start_c, current_l):
    global answer

    queue = deque([(start_r, start_c, current_l)])
    visited = [[False] * M for _ in range(N)]
    visited[start_r][start_c] = True

    dr = [-1, 1, 0, 0]
    dc = [0, 0, -1, 1]

    tunnel = {
        1 : [0, 1, 2, 3],
        2 : [0, 1],
        3 : [2, 3],
        4 : [0, 3],
        5 : [1, 3],
        6 : [1, 2],
        7 : [0, 2]
    }
    opposite = [1, 0, 3, 2]

    while queue:
        r, c, l = queue.popleft()

        if l == L:
            continue

        current_pipe = tunnel[board[r][c]]
        for p in current_pipe:
            nr = r + dr[p]
            nc = c + dc[p]

            if 0 <= nr < N and 0 <= nc < M:
                if board[nr][nc] != 0 and not visited[nr][nc]:
                    if opposite[p] in tunnel[board[nr][nc]]:
                        visited[nr][nc] = True
                        queue.append((nr, nc, l + 1))
                        answer += 1

T = int(input())
for t in range(T):
    N, M, R, C, L = map(int, input().split())
    board = [list(map(int, input().split())) for _ in range(N)]

    answer = 1
    bfs(R, C, 1)

    print(f"#{t + 1} {answer}")