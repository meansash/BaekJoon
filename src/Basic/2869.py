a,b,v = map(int,input().split())
v = float(v)
dayCount = 0
init_distance = a - b
temp_distance = 0
while True:
    temp_distance += init_distance
    dayCount += 1
    if temp_distance >= v:
        break
print(dayCount)
