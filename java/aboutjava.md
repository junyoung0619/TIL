## 팁
- ctrl+spacebar를 하면 필요한 import와 할 수 있는 함수들을 모두 보여준다.
- [자바로 백준풀때 팁](https://nahwasa.com/entry/%EC%9E%90%EB%B0%94%EB%A1%9C-%EB%B0%B1%EC%A4%80-%ED%92%80-%EB%95%8C%EC%9D%98-%ED%8C%81-%EB%B0%8F-%EC%A3%BC%EC%9D%98%EC%A0%90-boj-java)
## 자바의 입출력
### 입력
#### Scanner
- 기본적으로 `import java.util.Scanner;`,`Scanner sc = new Scanner(System.in);` 을 한 후 사용
    - `sc.nextInt()`: 다음에 나오는 정수를 입력 받을 수 있다. 하지만 만약 정수줄과 문자열 줄이 분리되어있다면 정수를 이 방법으로 입력받은 후에 `sc.nextLine()`를 한 번 하여 줄을 바꿔 주어야 한다.
    - `sc.next()` : 다음에 나오는 문자열 입력 받기
    - `sc.nextLine()` 이를 활용하면 다음 줄을 문자열로 받을 수 있다.    
- 다음과 같이 한 줄에 공백으로 구분된 수들을 입력받을 수 있다.

``` java
String str = sc.nextLine();
String[] dataarr = str.split(" ");
for(int j=1;배열 크기;j++){
    int data = Integer.parseInt(dataArr[j]); // data에 하나씩 순서대로 넣음, 배열 형태로 만들려면 배열 선언 후 채워넣어야 할듯
}
```

- 파일로 받기
`Scanner sc = new Scanner(new File("input.txt"));` 하면 됨

#### BufferedReader와 StringTokenizer
- 기본적으로 `import java.io.BufferedReader;` , `import java.io.InputStreamReader;` 후 사용
- 한 줄에 공백으로 구분된 수들을 다음과 같이 입력받음

``` java
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int n = Integer.parseInt(br.readline()); // 첫 줄에 수의 개수 주어진다는 가정
for ( int i = 0;i<n;i++){
    StringTokenizer st = new StringTokenizer(br.readline());
    int s = Integer.parseInt(st.nextToken());

    for (int j=0;j<s;j++){
        int data = Integer.parseInt(st.nextToken());
        System.out.println(data); // 출력
    }
}
```

### 출력
#### System.out
- `System.out.println()` : 출력 후 한 줄 자동 띄움
- `System.out.print()` : 출력 후 자동 띄움x (\n)으로 추가 가능
- `System.out.printf("서식",변수)` : 서식에 맞게 변수를 출력 f스트링과 유사, 자동 줄바꿈이 안되므로 \n으로 설정해주어야함.

#### BufferedWriter와 StringBuilder
- 기본적으로 `import java.io.BufferedWriter;`을 하고 사용해야함
- StringBuilder를 이용하여 출력하려는 데이터를 모두 모아서 하는 방법을 쓰는 것이 속도가 빠름
- 예시 코드

``` java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.reaLine());
            int s = Integer.parseInt(st.nextToken());

            for (int j=0;j<s;j++){
                int data = Integer.parseInt(st.nextToken());
                sb.append(data).append('\n');
            }
        }
    }
    System.out.println(sb);
}
```

### 타입관련
#### 문자와 문자열
- 문자를 int로 치환하면 아스키코드가 된다. (a=97,A=65)
- 반대로 수를 char로 치환하면 문자열로 돌아온다.
- 문자는 '', 문자열은 ""로 감쌈
- `Character.getNumericValue(문자)` : 문자로 표현된 숫자를 숫자로 바꿔주는 함수
- `Integer.parseInt(문자열)` : 문자열로 표현된 숫자를 숫자로 바꿔주는 함수
    - 예를 들어 `Integer.parseInt("123")` 은 123으로 바꿔줌
- `toCharArray()`문자열이 주어졌을 때 각 요소를 chararray로 바꾸는 기능이 있다.   
``` java
String s = "hello";
char[] arr = s.toCharArray();
for (char c : arr) {
    System.out.println(c);
}
// 출력: h, e, l, l, o
```
#### Heap
- 자바에서도 최소힙이 클래스로서 구현이 되어 있다.
- `import java.util.PriorityQueue` 를 기본적으로 해야 한다.
- `PriorityQueue<Ingeter> minHeap = new PriorityQueue<>();` 를 통해 정수 최소힙을 불러올 수 있다.
- 커스텀비교자(Comparator)로 최대 힙 구현 가능
    - `PriorityQueue<Ingeter> minHeap = new PriorityQueue<>((a,b->b-a));`
- 기능 (최소힙 기준)
|명령어|기능|
|---|---|
|`add(N)`|N을 heap에 추가|
|`poll()`|최소값 출력|
|`peek`|최소값출력|