T=int(input())
for tc in range(1,T+1):
    check= [[0]*10 for _ in range(10)]
    for i in range(10):
        for j in range(10):
            check[i][j]=[0,0]
    N=int(input())
    for _ in range(N):
        r1,c1,r2,c2,color=map(int,input().split())
        if color==1:
            for i in range(r1,r2+1):
                for j in range(c1,c2+1):
                    check[i][j][0]=1
        if color==2:
            for i in range(r1,r2+1):
                for j in range(c1,c2+1):
                    check[i][j][1]=1
    count=0
    for i in range(10):
        for j in range(10):
            if check[i][j]==[1,1]:
                count+=1
    print(f'#{tc} {count}')