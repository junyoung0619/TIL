# Array
- 배열
- 다차원 배열

## 배열
- 배열
    - 같은 종류의 데이터를 저장하기 위한 자료구조
    - 크기가 고정되어 있음
    - 배열을 객체로 취급(참조형)
    - 배열의 요소를 참조하려면 배열이름과 색인이라고 하는 음이 아닌 정수 값을 조합하여 사용
    - index 번호를 가지고 각 요소에 접근
    - index 번호는 0부터 시작
    - 배열이름.length를 통해 배열의 길이 조회 가능
    - 배열의 길이는 임의로 변경 불가
    - 길이 변경 필요시 새로운 배열을 생성 후 내용을 옮김
    - 배열의 각 요소는 해당 타입의 기본값으로 초기화(ex, int는 0, boolean은 false)

-배열의 선언
    - 데이터 타입[] 배열이름(권장)
    - 데이터타입 배열이름[]

| 타입 | 배열 이름(변수명) | 배열 선언문 |
| --- | --- | --- |
| int | int Array| int[] int Array; |
| char | charArray| char[] charArray; |
| boolean | boolArray | boolean[] boolArray; |
| String | strArray | String[] strArray; |
| float | floatArray | float[] floatArray; |

- 배열의 생성과 초기화
    - 자료형[] 배열이름 = new 자료형[길이];              // 배열 생성(자료형의 초기값으로 초기화)
    - 자료형[] 배열이름 = new 자료형[] {값1,값2,값3,값4}; // 배열 생성 및 값 초기화 (길이 넣으면 error)
    - 자료형[] 배열이름={값1,값2,값3,값4};                // 선언과 동시에 초기화
> new: 객체를 생성한 다음(메모리에 공간을 확보, 실제로 객체 생성) 해당 객체의 주소 반환

| 자료형 | 기본값 | 비고 |
| --- | --- | --- |
| boolean | false |  |
| char | '\u0000' | 공백 문자(널 문자) |
| byte, short, int | 0 |  |
| long | 0L |  |
| float | 0.0f |  |
| double | 0.0 |  |
| 참조형 변수 | null | 아무것도 참조하지 않음 |

- 배열의 메모리 생성과정
``` java
int[] nums = new int[3];
nums[0] = 11;
nums[1] = 7;
nums[2] = 23;

int[] nums = new int[] {27,54,83};
```
    
    - `int[]= nums`만 하면 배열이 생성되지는 않음
    - 변수 만들고, 배열만들고, 할당한다.

- 배열의 순회
    - 반복문을 이용하여 배열의 요소를 순회할 수 있음.
    - for-each: index 대신 직접 요소에 접근하는 변수를 제공 - read only
``` java
int intArray [] = {1,3,5,7,9};
for(int i=0;i<intArray.length;i++){
    System.out.println(intArray[i]);
}
for(int num : nums) {
	System.out.println(num);
}
```
- 배열의 출력
    - 반복문을 통해서 출력
    - Arrays.toString(배열):배열 안의 요소를 [값1,값2,...] 형태로 출력
        - import java.util.Arrays; 후 사용

- 배열의 복사
    - 배열은 생성하면 길이를 변경할 수 없기 때문에 더 많은 저장공간이 필요하다면 큰 배열을 생성하고 이전 배열의 값을 복사 해야함.
    - 새로운배열 = Arrays.copyOf(복사하고_싶은_배열, 새로운_배열의 크기)
    - System.arraycopy(Object src,int srcPos,Object dest,int destPos,int length) - 먼저 복사할 배열을 선언해야 함

``` java
		// Arrays.copyOf(원본배열, 새로운배열의크기)
        int[] nums = {1, 4, 6, 1, 4};
		int[] tmp2 = Arrays.copyOf(nums, nums.length*2);
		System.out.println(Arrays.toString(tmp2));
		
		
		// Arrays.copyOfRange(원본배열, 시작점, 끝인덱스(새로운 배열의 끝인덱스)) (새로운 배열의 크기= 끝인덱스-시작점이 됨)
		int[] tmp3 = Arrays.copyOfRange(nums, 0, nums.length*2);
		System.out.println(Arrays.toString(tmp3));
		
		
		// System.arraycopy(원본배열, 원본배열의시작점, 복사배열, 복사배열의시작점, 복사할길이(갯수))
		int[] tmp4 = new int[nums.length*2];
		System.arraycopy(nums, 0, tmp4, 0, nums.length);
		System.out.println(Arrays.toString(tmp4));
```

## 다차원 배열
- 다차원 배열이란?
    - 2차원 이상의 배열을 의미
    - 선언 시 []가 1개: 1차원 배열
    - 선언 시 []가 2개 이상: 다차원 배열
    - 배열의 배열
    - 배열 객체의 참조값을 요소로 갖는 배열
    - 2차원 배열은 배열 요소로 1차원 배열의 참조(주소)를 가지는 배열
    - ...
    - n차원 배열은 배열의 요소로 n-1차원 배열의 참조를 가지는 배열
- 2차원 배열 선언
    - 데이터타입[][] 배열이름
    - 데이터타입 배열이름[][]
    - 데이터타입[] 배열이름[]
- 2차원 배열 생성
    - 배열이름 = new 데이터타입[1차원 배열갯수(행의 갯수)][1차원 배열의 크기(열의 갯수)]
    - 배열이름 = new 데이터타입[1차원 배열 갯수(행의 갯수)][]; (기본적으로 1차원 배열이 참조이기 때문에 null이 들어간 3*1배열이 생성된다.) 
    - 배열이름 = new 데이터타입[][]{
        {첫번째 1차원 배열의 초기값},
        {두번째 1차원 배열의 초기값},
        ...
    }
    - Arrays.deepToString(): 다차원 배열을 출력 가능
        - import java.util.Arrays; 후 사용
- 3차원 배열 선언
    - 데이터타입 [][][] 배열이름
- 3차원 배열 생성
    - 배열 이름 = new 데이터타입 [크기a][크기b][크기c];
    - 배열 이름 = new 데이터타입 [크기 a][][];
    - 배열 이름 = new 데이터타입 [][][];