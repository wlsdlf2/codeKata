def dfs(cnt):
    global answer
    
    if cnt == change:
        answer = max(answer, int("".join(numbers)))
        return
    
    for i in range(len(numbers) - 1):
        for j in range(i + 1, len(numbers)):
            numbers[i], numbers[j] = numbers[j], numbers[i]
            
            state = ("".join(numbers), cnt + 1)
            if state not in visited:
                visited.add(state)
                dfs(cnt + 1)
                
            numbers[i], numbers[j] = numbers[j], numbers[i]

T = int(input())
for t in range(T):
    number_str, change = input().split()
    numbers = list(number_str)
    change = int(change)
    
    answer = 0
    visited = set()
    dfs(0)
    
    print(f"#{t+1} {answer}")