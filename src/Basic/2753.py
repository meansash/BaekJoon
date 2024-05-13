# n = int(input())
# if (n % 4 == 0 and n % 100 != 0) or n % 400 == 0 :
#     print(1)
# else :
#     print(0)

check_leap_year = lambda n: 1 if (n % 4 == 0 and n % 100 != 0) or n % 400 == 0 else 0
n = int(input())
print(check_leap_year(n))