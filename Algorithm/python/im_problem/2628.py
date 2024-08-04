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
n,m=map(int,input().split())
l=int(input())
row=[]
column=[]
for _ in range(l):
    a,b=map(int,input().split())
    if a==0:
        column.append(b)
    if a==1:
        row.append(b)
row.extend([0,n])
column.extend([0,m])
row=sorting(row)
column=sorting(column)
row_len=my_len(row)
column_len=my_len(column)
max_row=0
max_column=0
for i in range(row_len-1):
    if max_row<row[i+1]-row[i]:
        max_row=row[i+1]-row[i]
for i in range(column_len-1):
    if max_column<column[i+1]-column[i]:
        max_column=column[i+1]-column[i]
print(max_row*max_column)