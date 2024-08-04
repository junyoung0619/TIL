T=int(input())
for tc in range(1,T+1):
    num=int(input())
    scores=list(map(int,input().split()))
    check=[0]*101
    for score in scores:
        check[score]+=1
    max_len=0
    max_num=-1
    for i in range(101):
        if max_len<=check[i]:
            max_len=check[i]
            max_num=i
    print(f'#{tc} {max_num}')