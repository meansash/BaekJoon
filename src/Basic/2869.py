a,b,v = map(float,input().split())
dayCount = (v-b) / (a-b)
if dayCount != int(dayCount):
    dayCount = int(dayCount) + 1
else:
    dayCount = int(dayCount)

print(dayCount)
