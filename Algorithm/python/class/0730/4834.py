T= int(input())
for tc in range(1,T+1):
    N=int(input())
    numbers=input()
    lst=[0]*(10)
    max_len=0
    max_num=10
    for number in numbers:
        number=int(number)
        lst[number]+=1
    for i in range(10):
        if max_len<=lst[i]:
            max_num=i
            max_len=lst[i]
    print(f'#{tc} {max_num} {max_len}')
