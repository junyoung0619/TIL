n=int(input())
max_len=0
max_lst=[]
for i in range(n,-1,-1):
    lst=[n,i]
    count=1
    while lst[-1]>=0:
        lst.append(lst[-2]-lst[-1])
        count+=1
    lst.pop()
    if max_len<count:
        max_len=count
        max_lst=lst
print(max_len)
for element in max_lst:
    print(element,end=" ")
    