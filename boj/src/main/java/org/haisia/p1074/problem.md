# #1074 - Z 모양 탐색

---

## 문제
한수는 크기가 2^N × 2^N인 2차원 배열을 Z모양으로 탐색하려고 한다. 예를 들어, 2×2 배열을 왼쪽 위칸, 오른쪽 위칸, 왼쪽 아래칸, 오른쪽 아래칸 순서대로 방문하면 Z모양이다.

N > 1인 경우, 배열을 크기가 2^(N-1) × 2^(N-1)로 4등분한 후에 재귀적으로 순서대로 방문한다.

N이 주어졌을 때, r행 c열을 몇 번째로 방문하는지 출력하는 프로그램을 작성하시오.

---

### 입력
첫째 줄에 정수 N, r, c가 주어진다.  
(1 ≤ N ≤ 15, 0 ≤ r, c < 2^N)

---

### 출력
r행 c열을 몇 번째로 방문했는지 출력한다.

---

### 예제 입력 1
```text
2 3 1
```

### 예제 출력 1
```text
11
```

---

### 예제 입력 2
```text
3 7 7
```

### 예제 출력 2
```text
63
```

---

### 예제 입력 3
```text
1 0 0
```

### 예제 출력 3
```text
0
```

---

### 예제 입력 4
```text
4 7 7
```

### 예제 출력 4
```text
63
```

---

### 예제 입력 5
```text
10 511 511
```

### 예제 출력 5
```text
262143
```

---

### 예제 입력 6
```text
10 512 512
```

### 예제 출력 6
```text
786432
```