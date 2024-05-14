num_list = list(map(int,input().split()))
asc_num = sorted(num_list)
des_num = sorted(num_list,reverse=True)
if str(num_list) == str(des_num):
    print("descending")
elif str(num_list) == str(asc_num):
    print("ascending")
else:
    print("mixed")