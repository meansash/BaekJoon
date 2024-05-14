a = int(input())
b = int(input())
c = int(input())
count_arr = [0] * 10
abc = a * b * c
string_number = str(abc)
for char in string_number:
    char_to_int = int(char)
    count_arr[char_to_int] += 1

for num in count_arr:
    print(num)

