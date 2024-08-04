for tc in range(1,11):
    count=int(input())
    height=list(map(int,input().split()))
    diff=101
    while count>0 and diff>=2:
        max_h=0
        min_h=101
        lst=[0]*101
        for i in range(100):
            lst[height[i]]+=1
            if max_h<height[i]:
                max_h=height[i]
                max_index=i
            if min_h>height[i]:
                min_h=height[i]
                min_index=i
        height[max_index]-=1
        height[min_index]+=1
        if lst[max_h]>=2:
            if lst[min_h]>=2:
                diff=max_h-min_h
            else:
                diff=max_h-min_h-1
        else:
            if lst[min_h]>=2:
                diff=max_h-min_h-1
            else:
                diff=max_h-min_h-2
        count-=1
    print(f'#{tc} {diff}')