# #10816 - 숫자 카드 2

---

## 문제
숫자 카드는 정수가 하나씩 적혀 있는 카드입니다. 상근이는 이러한 숫자 카드 N개를 가지고 있습니다.  
정수 M개가 주어질 때, 이 정수가 적힌 숫자 카드를 상근이가 몇 개 가지고 있는지 구하는 프로그램을 작성하세요.

---

### 입력
1. 첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 **N**이 주어집니다. (1 ≤ N ≤ 500,000)
2. 둘째 줄에는 상근이가 가진 숫자 카드에 적혀 있는 **N개의 정수**가 공백으로 구분되어 주어집니다.
    - 각 정수는 **-10,000,000 이상, 10,000,000 이하**입니다.
3. 셋째 줄에는 상근이가 몇 개를 찾으려고 하는 숫자 카드의 개수 **M**이 주어집니다. (1 ≤ M ≤ 500,000)
4. 넷째 줄에는 상근이가 몇 개 가지고 있는지 구해야 할 **M개의 정수**가 공백으로 구분되어 주어집니다.
    - 각 정수는 **-10,000,000 이상, 10,000,000 이하**입니다.

---

### 출력
첫째 줄에 입력으로 주어진 **M개의 정수**에 대해, 각 수가 적힌 숫자 카드를 상근이가 몇 개 가지고 있는지를 공백으로 구분하여 출력합니다.

---

### 예제 입력 1
- 10 
- 6 3 2 10 10 10 -10 -10 7 3 
- 8 
- 10 9 -5 2 3 4 5 -10

### 예제 출력 1
3 0 0 1 2 0 0 2