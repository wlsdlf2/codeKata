def dfs(idx, current_score, current_cal):
    global max_score
    
    if current_cal > L:
        return
        
    if idx == N:
        max_score = max(max_score, current_score)
        return
        
    dfs(idx + 1, current_score + ingredients[idx][0], current_cal + ingredients[idx][1])
    dfs(idx + 1, current_score, current_cal)

T = int(input())
for t in range(T):
    N, L = map(int, input().split())
    ingredients = [list(map(int, input().split())) for _ in range(N)]
    
    max_score = 0
    dfs(0, 0, 0)
    
    print(f"#{t + 1} {max_score}")