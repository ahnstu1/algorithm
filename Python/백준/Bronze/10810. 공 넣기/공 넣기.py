condition = input().split(' ')
arr = [0] * int(condition[0])
repeat_count = int(condition[1])

while repeat_count:
    repeat_count -= 1
    case = input().split(' ')
    start = int(case[0])
    end = int(case[1])
    while start != end + 1:
        arr[start - 1] = int(case[2])
        start += 1

print(*arr, sep=' ')
