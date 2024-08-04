def my_len(list1):
    count=0
    for i in list1:
        count+=1
    return count
T= int(input())
for tc in range(1,T+1):
    arr=input()
    count=0
    check1=0
    check2=0
    length=my_len(arr)
    i=0
    while i<length-1:
        if arr[i:i+2]=="()":
            count=count+check1
            check1-=check2
            check2=0
            i=i+2
        elif arr[i]=="(":
            check1+=1
            i=i+1
        else:
            check2+=1
            i=i+1
    if arr[length-2:length-1]!="()":
        count+=check1
    print(f'#{tc} {count}')