for tc in range(1,11):
    n=int(input())
    arr=[list(map(int,input().split())) for _ in range(100)]
    di=[0,0,-1]
    dj=[1,-1,0]
    for i in range(100):
        if arr[99][i]==2:
            start_j=i
            break
    start_i=99
    arr[start_i][start_j]=-1
    while start_i>0:
        for k in range(3):
            ni=start_i+di[k]
            nj=start_j+dj[k]
            if 0<=ni<100 and 0<=nj<100 and arr[ni][nj]==1:
                start_i=ni
                start_j=nj
                arr[ni][nj]=-1
                break
    print(f'#{tc} {start_j}')