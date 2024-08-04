def my_len(list1):
    count=0
    for i in list1:
        count+=1
    return count
def sorting(list1):
    length=my_len(list1)
    if length==1:
        return list1
    else:
        i=0
        j=0
        count=0
        list2=sorting(list1[:length//2])
        list3=sorting(list1[length//2:])
        list4=[]
        while count<length:
            if i>=length//2:
                list4.append(list3[j])
                count+=1
                j+=1
            elif j>=(length+1)//2:
                list4.append(list2[i])
                count+=1
                i+=1
            else:
                count+=1
                if list2[i]>list3[j]:
                    list4.append(list3[j])
                    j+=1
                else:
                    list4.append(list2[i])
                    i+=1
        return list4
def change1(string):
    return dct[string]
def change2(num):
    return lst[num]
T=int(input())
lst=["ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"]
dct={}
for i in range(10):
    dct[lst[i]]=i
for tc in range(1,T+1):
    a,n=input().split()
    n=int(n)
    arr=list(map(change1,input().split()))
    arr=sorting(arr)
    arr=list(map(change2,arr))
    print(f'#{tc}')
    print(*arr)