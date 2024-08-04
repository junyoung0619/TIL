T=int(input())
for tc in range(1,T+1):
    N,k=map(int,input().split())
    count=0
    for i in range(1<<12):
        count_num=0
        sum_num=0
        for j in range(12):
            if i & 1<<j:
                count_num+=1
                sum_num+=j+1
        if count_num==N and sum_num==k:
            count+=1
    print(f'#{tc} {count}')