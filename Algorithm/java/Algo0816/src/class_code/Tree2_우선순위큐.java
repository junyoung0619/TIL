package class_code;
import java.util.Collections;
import java.util.PriorityQueue;

class Person implements Comparable<Person> {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return this.name + " : " + this.age;
	}

	// o : 상대방
	// (나, 상대방)
	@Override
	public int compareTo(Person o) {
		// -1(음수), 0, 1(양수) 셋 중 하나를 리턴
		// 0 : 동일하다
		// 1 : 위치를 바꾼다
		// -1 : 위치를 바꾸지 않는다
//		if (this.age == o.age)
//			return 0;
//		if (this.age > o.age)
//			return 1;
//		return -1;
		return this.age - o.age;
	}
}

public class Tree2_우선순위큐 {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.add(-10);
		pq.add(-20);
		pq.add(-30);
		pq.add(10);
		pq.add(-40);
		
		while (!pq.isEmpty()) {
			int data = pq.poll();
			System.out.println(-data);
		}
		
		PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
		
		pq2.add(10);
		pq2.add(20);
		pq2.add(30);
		pq2.add(-10);
		pq2.add(40);
		
		while (!pq2.isEmpty()) {
			int data = pq2.poll();
			System.out.println(data);
		}
		
		
//		PriorityQueue<Person> personPQ = new PriorityQueue<>(new PersonComparator());
		PriorityQueue<Person> personPQ = 
				new PriorityQueue<>((p1, p2)->{return p2.age - p1.age;}); 
		
		personPQ.add(new Person("루나", 3));
		personPQ.add(new Person("데이지", 1));
		personPQ.add(new Person("맥스", 8));
		
		while (!personPQ.isEmpty()) {
			Person p = personPQ.poll();
			System.out.println(p);
		}
		
		
		
		
	}
}
