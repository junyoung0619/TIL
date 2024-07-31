T=int(input())
for tc in range(1,T+1):
    N,M=map(int,input().split())
    arr=[list(map(int,input().split())) for _ in range(N)]
    di=[0,0,0,1,-1] # i방향 변화량
    dj=[0,1,-1,0,0] # j방향 변화량
    max_count=0
    for i in range(N):
        for j in range(M):
            count=0
            for k in range(5):
                ni=i+di[k]
                nj=j+dj[k]
                if 0<=ni<N and 0<=nj<M: # 범위에 있을 때만 더함
                    count+=arr[ni][nj]
            if max_count<count:
                max_count=count
    print(f'#{tc} {max_count}')