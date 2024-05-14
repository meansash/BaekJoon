import math
input_num = list(map(int,input().split()))
pow_num = 0
for num in input_num:
    temp_num = math.pow(num,2)
    pow_num += temp_num

result = int(pow_num % 10)
print(result)

