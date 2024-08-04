T=int(input())
for tc in range(1,T+1):
    N = int(input())
    seq = input()
    count=0
    max_count=0
    for i in range(N):
        if seq[i]=="1":
            count+=1
        else:
            if max_count<count:
                max_count=count
            count=0
        if i==N-1:
            if max_count<count:
                max_count=count
    print(f'#{tc} {max_count}')
