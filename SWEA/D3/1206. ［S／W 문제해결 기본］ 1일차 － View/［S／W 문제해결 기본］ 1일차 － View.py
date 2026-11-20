for t in range(10):
    N = int(input())
    heights = list(map(int, input().split()))
    answer = 0
    
    for i in range(2, len(heights) - 2):
        max_neighbor = max(heights[i - 2], heights[i-1], heights[i + 1], heights[i + 2])
        
        if heights[i] > max_neighbor:
            answer += heights[i] - max_neighbor
            
    print(f"#{t + 1} {answer}")