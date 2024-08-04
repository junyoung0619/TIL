def find_count(l,value):
    start=1
    end=l
    count=1
    mid=(start+end)//2
    while mid!=value:
        if mid<value:
            start=mid
        else:
            end=mid
        count+=1
        mid=(start+end)//2
    return count
T=int(input())
for tc in range(1,T+1):
    P,Pa,Pb=map(int,input().split())
    start=1
    end=P
    count_1=find_count(P,Pa)
    count_2=find_count(P,Pb)
    if count_1>count_2:
        result="B"
    elif count_1<count_2:
        result="A"
    else:
        result=0
    print(f'#{tc} {result}')