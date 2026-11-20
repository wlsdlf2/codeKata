T = int(input())
for t in range(T):
    N = int(input())
    prices = []
    
    for p in input().split():
        prices.append(int(p))
        
    max_price = 0
    profit = 0
    for price in prices[::-1]:
        if price >= max_price:
            max_price = price
        else:
            profit += max_price - price
            
    print(f"#{t+1} {profit}")