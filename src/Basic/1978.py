import math

n = int(input())
num_list = list(map(int, input().split()))
count = 0

for arr in num_list:
    if arr == 1:
        continue
    is_prime = True
    for i in range(2, int(math.sqrt(arr)) + 1):
        if arr % i == 0:
            is_prime = False
            break
    if is_prime:
        count += 1

print(count)
