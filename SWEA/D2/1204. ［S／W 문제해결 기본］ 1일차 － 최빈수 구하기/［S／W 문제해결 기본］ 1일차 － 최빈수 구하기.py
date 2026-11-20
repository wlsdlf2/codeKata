T = int(input())
for _ in range(T):
    TN = int(input())
    scores = list(map(int, input().split()))
    
    dict = {}
    for score in scores:
        if score in dict:
            dict[score] += 1
        else:
            dict[score] = 1
            
    max_count = [0, 0]
    for i in dict:
        if (dict[i] == max_count[1] and i > max_count[0]) or dict[i] > max_count[1]:
            max_count[0] = i
            max_count[1] = dict[i]
            
    print(f"#{TN} {max_count[0]}")