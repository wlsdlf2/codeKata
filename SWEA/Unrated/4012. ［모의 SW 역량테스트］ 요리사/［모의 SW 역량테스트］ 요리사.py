def dfs(cnt, idx):
    global min_taste
    
    if cnt == N // 2:
        A = []
        B = []
        
        for i in range(N):
            if visited[i]:
                A.append(i)
            else:
                B.append(i)
        
        sum1 = sum2 = 0
        for i in range(len(A)):
            for j in range(len(A)):
                sum1 += board[A[i]][A[j]]
                sum2 += board[B[i]][B[j]]
                
        min_taste = min(min_taste, abs(sum1 - sum2))
        return
    
    for i in range(idx, N):
        visited[i] = True
        dfs(cnt + 1, i + 1)
        visited[i] = False

T = int(input())
for t in range(T):
    N = int(input())
    board = [list(map(int, input().split())) for _ in range(N)]
    
    visited = [False] * N
    visited[0] = True
    
    min_taste = 20000 * 16 * 16
    dfs(1, 1)
    
    print(f"#{t + 1} {min_taste}")