testcase = int(input())
inputs = []
result = []

for i in range(testcase):
    inputs.append(list(map(int,input().split())))

for arr in inputs:
    total = sum(arr[1:])
    avg = total / arr[0]
    overAvg = 0
    for element in arr[1:]:
        if element > avg:
            overAvg += 1
    result.append((overAvg / arr[0]) * 100)

for i in result:
    print(str(round(i,3)) + "%")