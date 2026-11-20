from collections import deque

def bfs(start_r, start_c):
    queue = deque([(start_r, start_c, 0)])
    visited = [[False] * N for _ in range(N)]
    visited[start_r][start_c]
    
    dr = [-1, 1, 0, 0]
    dc = [0, 0, -1, 1]
    
    while queue:
        r, c, dist = queue.popleft()
        
        if miro[r][c] == 3:
            return dist - 1
        
        for d in range(4):
            nr = r + dr[d]
            nc = c + dc[d]
            
            if 0 <= nr < N and 0 <= nc < N:
                if miro[nr][nc] != 1 and not visited[nr][nc]:
                    visited[nr][nc] = True
                    queue.append((nr, nc, dist + 1))
                    
    return 0

T = int(input())
for t in range(T):
    N = int(input())
    miro = [list(map(int, input().strip())) for _ in range(N)]
    
    r = c = 0
    for i in range(N):
        for j in range(N):
            if miro[i][j] == 2:
                r, c = i, j
                
    answer = bfs(r, c)
    
    print(f"#{t + 1} {answer}")