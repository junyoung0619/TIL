# Dynamic Programming
- 피보나치 수열
- Memorization
- 동적 계획 알고리즘
- 동전 거스름 돈
- 0-1 Knapsack

## 피보나치 수열
### 피보나치 수열
- 0과 1로 시작하고 이전의 두 수 합을 다음 항으로 하는 수열을 피보나치 수열이라고 한다.
    - 0, 1, 1, 2, 3, 5, 8, 13, ...
- 피보나치 수열의 i번째 값을 계산하는 함수 F를 정의하면 다음과 같다.
    - F_0 = 0, F_1 = 1
    - F_i = F_(i-1) = F_(i-2) for i>=2
- 위의 정의로부터 피보나치 수열의 i번째 항을 반환하는 함수를 재귀함수로 구현할 수 있다.

```
fibo(n)
    IF n < 2 : RETURN n
    ELSE     : RETURN fibo(n - 1) + fibo(n - 2)
```

## Memoization
### Memoization
- 메모이제이션은 컴퓨터 프로그램을 실행할 때, 이전에 계산한 값을 메모리에 저장해서 매번 다시 계산하지 않도록 하여 전체적인 실행속도를 빠르게 하는 기술이다.
- 동적 계획법의 핵심이 되는 기술이다.
- 'memoization'은 글자 그대로 해석하면 '메모리에 넣기'라는 의미이며 '기억되어야 할 것' 이라는 뜻의 라틴어 memorandum에서 파생되었다.
- 피보나치수를 구하는 알고리즘에서 fibo(n)의 값을 계산하자마자 저장하면 실행시간은 O(n)

- Memoization 방법을 적용한 알고리즘

```
memo를 위한 배열을 할당하고, 모두 0으로 초기화 한다.
memo[0]을 0으로 memo[1]는 1로 초기화 한다.

fibo(n)
    IF n > 2 AND memo[n] = 0
        memo[n] <- fibo(n-1) + fibo(n-2)
    RETURN memo[n]

```

- 메모이제이션
    - 추가적인 메모리 공간 필요
    - 재귀 함수 호출로 인한 시스템 호출 스택을 사용 -> 실행 속도 저하 또는 오버 플로어가 발생할 수 있음
- 해결책?

## 동적 계획 알고리즘
- 동적 계획 알고리즘은 그리디 알고리즘과 같이 최적화 문제를 해결하는 알고리즘이다.
- 최적화 문제 : 최적(최대값이라 최소값 같은) 값을 구하는 문제
    - 해당 문제에 여러 해가 있을 수 있다.
    - 특정한 최적해를 구하는 것이 아니라 어떤 최적해를 구하는 것이다.
- 동적 계획 알고리즘은 먼저 작은 부분 문제들의 해들을 구하고, 이들을 이용하여 보다 큰 크기의 부분 문제들을 해결하여, 최종적으로 원래 주어진 문제를 해결하는 알고리즘 설계 기법이다.

## 동적 계획법의 적용 요건
- 동적 계획법을 적용하려는 문제는 필히 다음과 같은 요건을 가지고 있어야 한다.
    - 중복 부분문제 구조
    - 최적 부분문제 구조

## 중복 부분문제 구조
- DP는 큰 문제를 이루는 작은 문제들을 먼저 해결하고, 작은 문제들의 최적 해를 이용하여 순환적으로 큰 문제를 해결한다.
    - 순환적인 관계를 명시적으로 표현학 위해서는 동적 계획법에서는 일반적으로 수학적 도구인 점화식을 사용한다.
- DP는 문제의 순환적인 성질 때문에 이전에 계산되어졌던 작은 문제의 해가 다른 어딘가에서 필요하게 되는데 이를 위해 DP에서는 이미 해결된 작은 문제들의 해들을 어떤 저장 공간에 저장하게 된다.
- 그리고 이렇게 저장된 해들이 다시 필요할 때 마다 해를 얻기 위해 다시 문제를 재계산하지 않고, table의 참조를 통해서 중복된 계산을 피하게 된다.
- 동적 계획법이 최적화에 대한 어느 문제에나 적용될 수 있는 것은 아니다.
- 주어진 문제가 최적화의 원칙을 만족해야만 동적 계획법을 효율적으로 적용
- 최적화의 원칙이란 어떤 문제에 대한 해가 최적일 때, 그 해를 구성하는 작은 문제들의 해 역시 최적이어야 하는 것이다.
- 동적 계획법의 방법 자체가 큰 문제의 최적 해를 작은 문제의 최적해들을 이용하여 구하기 때문에 만약 큰 문제의 최적해가 작은 문제들의 최적해들로 구성되지 않는다면 이 문제는 동적 계획법을 적용할 수 없다.