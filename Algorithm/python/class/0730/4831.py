T=int(input())
for tc in range(1,T+1):
    K,N,M=map(int,input().split())
    busstop=list(map(int,input().split()))
    count=0
    location=0
    while True:
        if location+K>=N:
            break
        check=0
        for i in range(location+K,location,-1):
            if i in busstop:
                check=1
                location=i
                count+=1
                break
        if check==0:
            count=0
            break
    print(f'#{tc} {count}')