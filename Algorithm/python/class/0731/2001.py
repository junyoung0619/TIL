T=int(input())
for tc in range(1,T+1):
    N,M=map(int,input().split())
    arr=[list(map(int,input().split()))for _ in range(N)]
    max_count=0
    for i in range(N-M+1): # i,j는 파리채의 왼쪽 위의 좌표이고 파리채의 크기가 M이면 i와 j의 범위가 제한된다.
        for j in range(N-M+1):
            count=0 # 왼쪽위가 (i,j)일 때 잡는 파리의 수
            for k in range(i,i+M):  # (i,j)을 기준으로 y축방향 M, x축방향 M인 파리채에 속하는 모든 원소를 더함
                for l in range(j,j+M):
                    count+=arr[k][l]
            if max_count<count:
                max_count=count
    print(f'#{tc} {max_count}')