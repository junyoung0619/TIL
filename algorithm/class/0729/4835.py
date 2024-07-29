t=int(input())
for l in range(1,t+1):
    n,m=map(int,input().split())
    lst1=list(map(int,input().split()))
    lst2=[0]*(n+1)
    max_sum=0
    min_sum=int(1e9)
    for i in range(1,n+1):
        lst2[i]=lst2[i-1]+lst1[i-1]
    for i in range(1,n-m+2):
        if max_sum<lst2[i+m-1]-lst2[i-1]:
            max_sum=lst2[i+m-1]-lst2[i-1]
        if min_sum>lst2[i+m-1]-lst2[i-1]:
            min_sum=lst2[i+m-1]-lst2[i-1]
    print(f'#{l} {max_sum-min_sum}')