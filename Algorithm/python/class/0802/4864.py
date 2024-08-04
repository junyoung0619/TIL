def my_len(lst):
    count=0
    for _ in lst:
        count+=1
    return count
T=int(input())
for tc in range(1,T+1):
    str1=input()
    str2=input()
    len1=my_len(str1)
    len2=my_len(str2)
    check=0
    for i in range(len2-len1+1):
        if str1==str2[i:i+len1]:
            check=1
            break
    print(f'#{tc} {check}')