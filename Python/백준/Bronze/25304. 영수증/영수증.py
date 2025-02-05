total_price = int(input())
goods_num = int(input())
total = 0

while goods_num:
    goods_num -= 1
    goods_info = input().split(' ')
    total += int(goods_info[0]) * int(goods_info[1])

if total_price == total:
    print("Yes")
else:
    print("No")
