for l in range(1,11):
    n=int(input())
    height=list(map(int,input().split()))
    count=0
    dx=[-2,-1,1,2]
    for i in range(2,n-2):
        max_h=0
        for j in range(4):
            nx=i+dx[j]
            if max_h<height[nx]:
                max_h=height[nx]
        if max_h<height[i]:
            count+=height[i]-max_h
    print(f'#{l} {count}')
            