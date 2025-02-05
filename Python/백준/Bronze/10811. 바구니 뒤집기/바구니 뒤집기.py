condition = input().split(' ')
arr = [0] * int(condition[0])
cnt = int(condition[1])

for i in range(0, int(condition[0])):
    arr[i] = i + 1

for i in range(0, cnt):
    reverse_con = input().split(' ')
    start = int(reverse_con[0]) - 1
    end = int(reverse_con[1]) - 1
    while end > start:
        tmp = arr[start]
        arr[start] = arr[end]
        arr[end] = tmp
        start += 1
        end -= 1

print(*arr, sep=' ')
