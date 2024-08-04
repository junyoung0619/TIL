T=int(input())
for tc in range(1,T+1):
    N,K=map(int,input().split())
    arr=[list(map(int,input().split())) for _ in range(N)]
    count=0
    for i in range(N): # 각 행에 대해서 단어가 들어갈 수 있는지 판별
        check=0 # 연속된 흰색칸의 수
        for j in range(N):
            if arr[i][j]==0:  # 검은 칸인 경우 지금까지 연속된 흰색칸의 수가 K와 일치하면 count 증가
                if check==K:
                    count+=1
                check=0
                continue
            else:
                check+=1    # 흰 칸의 경우 기본적으로 check를 1증가시키나 마지막 칸인 경우 지금까지 모든 check가 K와 같을 시 count증가
                if j==N-1 and check==K:
                    count+=1
    for j in range(N): # 각 열에 대해서 단어가 들어갈 수 있는 지 판별 (기본적인 알고리즘은 위와 동일)
        check=0
        for i in range(N):
            if arr[i][j]==0:
                if check==K:
                    count+=1
                check=0
                continue
            else:
                check+=1
                if i==N-1 and check==K:
                    count+=1
    print(f'#{tc} {count}')