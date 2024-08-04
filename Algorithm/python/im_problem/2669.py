c=[0]*4
for i in range(4):
    c[i]=list(map(int,input().split()))
count=0
for i in range(1,100):
    for j in range(1,100):
        for k in range(4):
            if c[k][1]<=i and c[k][3]>=i+1 and c[k][0]<=j and c[k][2]>=j+1:
                count+=1
                break

print(count)