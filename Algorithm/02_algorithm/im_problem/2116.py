n=int(input())
c=[0]*n
max_sum=0
for i in range(n):
    c[i]=list(map(int,input().split()))
    c[i][3],c[i][4]=c[i][4],c[i][3]
for i in range(6):
    count=0
    ex_1=c[0][i]
    for j in range(n):
        for k in range(6):
            if c[j][k]==ex_1:
                max_num=0
                for l in range(6):
                    if l!=k and l!=5-k and max_num<c[j][l]:
                        max_num=c[j][l]
                ex_1=c[j][5-k]
                print(ex_1)
        count+=max_num
    if max_sum<count:
        max_sum=count
print(max_sum)