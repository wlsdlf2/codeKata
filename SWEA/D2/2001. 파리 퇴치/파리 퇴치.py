T = int(input())
for t in range(T):
    N, M = map(int, input().split())
    
    flies = []
    for _ in range(N):
        row = list(map(int, input().split()))
        flies.append(row)
        
    max_count = 0
    for i in range(N - M + 1):
        for j in range(N - M + 1):
            current_sum = 0
            
            for k in range(i, i + M):
                current_sum += sum(flies[k][j : j + M])
                
            max_count = max(max_count, current_sum)
            
    print(f"#{t + 1} {max_count}")