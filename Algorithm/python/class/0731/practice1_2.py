T=int(input())
for tc in range(1,T+1):
    arr=list(map(int,input().split()))
    check=0
    for i in range(1,1<<10): # 0의 경우에는 공집합이므로 제외한다.
        count=0 # 부분집합의 원소의 합을 나타내는 변수
        for j in range(10):
            if i&(1<<j):
                count+=arr[j] # j번쨰 원소가 포함되어있으니 count에 j번째 원소 더함
        if count==0:
            check=1
    print(f'#{tc} {check}')