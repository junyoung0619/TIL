T=int(input())
for tc in range(1,T+1):
    N,M=map(int,input().split())
    arr=[list(map(str,input())) for _ in range(N)]
    result=[0]*M
    for i in range(N):
        for j in range(N-M+1):
            check=0
            for l in range(M):
                if arr[i][j+l]!=arr[i][j+M-1-l]:
                    check=1
                    break
                else:
                    result[l]=arr[i][j+l]
            if check==0:
                final_result="".join(result)
    for i in range(N-M+1):
        for j in range(N):
            check=0
            for l in range(M):
                if arr[i+l][j]!=arr[i+M-1-l][j]:
                    check=1
                    break
                else:
                    result[l]=arr[i+l][j]
            if check==0:
                final_result="".join(result)
    print(f'#{tc} {final_result}')