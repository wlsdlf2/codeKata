def dfs(idx, current_h):
    global answer
    
    if current_h >= B:
        answer = min(answer, current_h)
        return
    
    if idx == N:
        return
    
    dfs(idx + 1, current_h + heights[idx])
    dfs(idx + 1, current_h)

T = int(input())
for t in range(T):
    N, B = map(int, input().split())
    heights = list(map(int, input().split()))
    
    answer = 200000
    dfs(0, 0)
    
    print(f"#{t + 1} {answer - B}")