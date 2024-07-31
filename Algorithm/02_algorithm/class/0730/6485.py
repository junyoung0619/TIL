T=int(input())
for tc in range(1,T+1):
    N=int(input())
    A=[0]*N
    B=[0]*N
    for i in range(N):
        A[i],B[i]=map(int,input().split())
    P=int(input())
    C=[0]*P
    for i in range(P):
        C[i]=int(input())
    print(f'#{tc} ',end="")
    for i in range(P):
        count=0
        for j in range(N):
            if A[j]<=C[i]<=B[j]:
                count+=1
        print(count,end=" ")
    print("")
