condition = input().split(' ')
case_count = int(condition[0])
arr = [0] * case_count
cnt = int(condition[1])

while case_count:
    arr[case_count - 1] = case_count
    case_count -= 1

while cnt:
    cnt -= 1
    condition = input().split(' ')
    fst_target = int(condition[0]) - 1
    snd_target = int(condition[1]) - 1
    tmp = arr[snd_target]
    arr[snd_target] = arr[fst_target]
    arr[fst_target] = tmp

print(*arr, sep=' ')
