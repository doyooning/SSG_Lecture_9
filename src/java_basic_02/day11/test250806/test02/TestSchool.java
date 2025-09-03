package java_basic_02.day11.test250806.test02;

public class TestSchool {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setName("홍길동");
		s.setAge(20);
		s.setId(200201);
		Teacher t = new Teacher ();
		t.setName("이순신");
		t.setAge(30);
		t.setSubject("JAVA");
		Employee  e= new Employee();
		e.setName("유관순");
		e.setAge(40);
		e.setDept("교무과");
		
		s.print();
		t.print();
		e.print();
	}

}
