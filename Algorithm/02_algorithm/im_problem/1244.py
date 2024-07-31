n=int(input())
status=[0]
status.extend(list(map(int,input().split())))
m=int(input())
d=[0]*m
for i in range(m):
    a,b=map(int,input().split())
    if a==1:
        for j in range(b,n+1,b):
            status[j]=1-status[j]
    else:
        status[b]=1-status[b]
        count=1
        while 1<=b-count and b+count<=n and status[b-count]==status[b+count] :
            status[b-count]=1-status[b-count]
            status[b+count]=1-status[b+count]
            count+=1
d=(n-1)//20
status=list(map(str,status))
for i in range(d):
    print(' '.join(status[i*20+1:(i+1)*20+1]))
print(' '.join(status[d*20+1:]))