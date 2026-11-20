from collections import deque

def bfs(start_r, start_c):
    queue = deque([(start_r, start_c)])
    visited = [[False] * 16 for _ in range(16)]
    visited[start_r][start_c] = True
    
    dr = [-1, 1, 0, 0]
    dc = [0, 0, -1, 1]
    
    while queue:
        r, c = queue.popleft()
        
        if board[r][c] == 3:
            return 1
        
        for d in range(4):
            nr = r + dr[d]
            nc = c + dc[d]
            
            if 0 <= nr < 16 and 0 <= nc < 16:
                if board[nr][nc] != 1 and not visited[nr][nc]:
                    visited[nr][nc] = True
                    queue.append((nr, nc))
                    
    return 0

for _ in range(10):
    t = int(input())
    board = [list(map(int, input().strip())) for _ in range(16)]
    
    r = c = 0
    for i in range(16):
        for j in range(16):
            if board[i][j] == 2:
                r, c = i, j
                
    answer = bfs(r, c)
    
    print(f"#{t} {answer}")