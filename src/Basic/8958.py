testcase = int(input())
input_str = []
final_score = []

for i in range(testcase):
    input_str.append(input())

for string in input_str:
    scoreTemp = 0
    score = 0
    for char in string:
        if char == 'O':
            scoreTemp += 1
            score += scoreTemp
        else:
            scoreTemp = 0
    final_score.append(score)

for i in final_score:
    print(i)