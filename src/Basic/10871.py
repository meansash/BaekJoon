# n,x = map(int,input().split())
# a = list(map(int,input().split()))
# result = []
# for i in a:
#     if  i < x:
#         result.append(i)
# print(result)

n, x = map(int,input().split())
a = list(map(int,input().split()))
result = list(filter(lambda i : i < x , a))
for i in result:
    print(i)