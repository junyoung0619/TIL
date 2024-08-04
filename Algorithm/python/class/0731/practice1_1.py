T=int(input())
for tc in range(1,T+1):
    N=int(input())
    arr=[list(map(int,input().split())) for _ in range(N)]
    count=0 # 합을 저장할 변수
    for i in range(N):
        count+=(arr[i][i]+arr[i][N-1-i]) #  정방향 대각선과 역방향 대각선의 i행 성분을 더함
    if N%2==1: # 배열의 크기가 홀수인 경우 가운데 원소는 정방향, 역방향 대각선에 모두 포함되므로 제거
        count-=arr[(N-1)//2][(N-1)//2]
    print(f'#{tc} {count}')