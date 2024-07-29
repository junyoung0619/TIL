t=int(input())
for l in range(1,t+1):
    n=int(input())
    lst=[2,3,5,7,11]
    lst2=[0]*5
    for i in range(5):
        div=lst[i] 
        while n%div==0:
            n=n//div
            lst2[i]+=1
    print(f'#{l}',end=" ")
    for i in range(5):
        print(lst2[i],end=" ")
    print("")