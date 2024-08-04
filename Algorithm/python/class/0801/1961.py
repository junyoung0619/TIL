T=int(input())
for tc in range(1,T+1):
    N=int(input())
    arr=[list(map(int,input().split())) for _ in range(N)]
    new_arr=[[0]*(3*N+2) for _ in range(N)]
    for i in range(N):
        for j in range(N):
            new_arr[j][N-1-i]=arr[i][j]
            new_arr[N-1-i][2*N-j]=arr[i][j]
            new_arr[N-1-j][2*N+2+i]=arr[i][j]
    print(f'#{tc}')
    for i in range(N):
        for j in range(3*N+2):
            if j==N or j==2*N+1:
                print(" ",end="")
            else:
                print(new_arr[i][j],end="")
        print("")
