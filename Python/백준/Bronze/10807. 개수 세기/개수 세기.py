count = int(input())
num = input().split(' ')
target = input()
result = 0

for i in range(0, count):
    if num[i] == target:
        result += 1

print(result)