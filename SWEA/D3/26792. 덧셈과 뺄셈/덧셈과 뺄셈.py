TC = int(input())
for _ in range(TC):
    X, Y = input().split()
    X = int(X)
    Y = int(Y)
    
    A = (X + Y) // 2
    B = X - A
    print(f"{A} {B}")