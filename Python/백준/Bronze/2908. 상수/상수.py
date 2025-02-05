st = input().split(' ')
print(int(st[0][::-1]) if int(st[0][::-1]) > int(st[1][::-1]) else int(st[1][::-1]))
