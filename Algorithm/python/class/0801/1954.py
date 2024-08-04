T=int(input())
for tc in range(1,T+1):
    N=int(input())
    di=[0,1,0,-1]
    dj=[1,0,-1,0]
    arr=[[0]*N for _ in range(N)]
    for j in range(N):
        arr[0][j]=j+1
    count=N-1
    i_axis=0
    j_axis=N-1
    num=N+1
    k=1
    while True:
        if count==0:
            break
        for _ in range(2):
            for _ in range(count):
                i_axis+=di[k]
                j_axis+=dj[k]
                arr[i_axis][j_axis]=num
                num+=1
            k=(k+1)%4
        count-=1
        if count==0:
            break
        for _ in range(2):
            for _ in range(count):
                i_axis += di[k]
                j_axis += dj[k]
                arr[i_axis][j_axis] = num
                num += 1
            k = (k + 1) % 4
        count-=1
    print(f'#{tc}')
    for i in range(N):
        for j in range(N):
            print(arr[i][j],end=" ")
        print("")

