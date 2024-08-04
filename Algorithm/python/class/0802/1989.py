T=int(input())
for tc in range(1,T+1):
    st=input()
    if st==st[::-1]:
        result=1
    else:
        result=0
    print(f'#{tc} {result}')