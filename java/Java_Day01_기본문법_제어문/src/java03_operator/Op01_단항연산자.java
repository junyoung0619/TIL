package java03_operator;

public class Op01_단항연산자 {

    public static void main(String[] args) {
       // 다음 중 올바른 값을 채워 넣으시오.
        int a = 5;
        System.out.println(a++); // 5 : 후위형: 먼저 값을 출력한 다음 증감시킨다.
        // a는 현재 6이라는 값을 가지고 있음.
        System.out.println(++a); // 7 : 전위형: 먼저 값을 증감시킨다음 출력한다.
        System.out.println(--a); // 6 
        System.out.println(a); // 6
        System.out.println(a--); // 6
        System.out.println(a++); // 5
        
        System.out.println(-a); // -6 : 음수 -> 양수, 양수 -> 음수
        System.out.println(~a); // -7 : 1의 보수로 바뀜 
//        
        System.out.println(!false); // true : 논리 반전 f ->t , t -> f
        
    }
    
}
