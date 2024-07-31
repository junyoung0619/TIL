T=int(input())
for tc in range(1,T+1):
    N=int(input())
    total=0
    di=[0,0,1,-1]
    dj=[1,-1,0,0]
    arr=[list(map(int,input().split())) for _ in range(N)]
    for i in range(N):
        for j in range(N):
            for k in range(4):
                ni=i+di[k]
                nj=j+dj[k]
                if 0<=ni<N and 0<=nj<N:
                    if arr[ni][nj]>arr[i][j]:
                        total+=(arr[ni][nj]-arr[i][j])
                    else:
                        total-=(arr[ni][nj]-arr[i][j])
    print(f'#{tc} {total}')