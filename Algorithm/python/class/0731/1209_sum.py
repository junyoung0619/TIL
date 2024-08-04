for tc in range(1,11):
    n=int(input())
    c=[0]*100
    for i in range(100):
        c[i]=list(map(int,input().split()))
    max_sum=0
    count=0
    for i in range(100):
        count+=c[i][i]
    if max_sum<count:
        max_sum=count
    count=0
    for i in range(100):
        count+=c[i][99-i]
    if max_sum<count:
        max_sum=count
    for i in range(100):
        count1=0
        count2=0
        for j in range(100):
            count1+=c[i][j]
            count2+=c[j][i]
        if max_sum<count1:
            max_sum=count1
        if max_sum<count2:
            max_sum=count2
    print(f'#{tc} {max_sum}')