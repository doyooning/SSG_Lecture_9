package java_basic_02.day11.inheritanceTest.test2;

public class Student {
	private String name;
	private String subject;
	private int fee;
	private double returnFee;

	public Student(String name, String subject, int fee) {
		this.name = name;
		this.subject = subject;
		this.fee = fee;
	}

	public void calcReturnFee() {
		if (subject.equals("javaprogram")) {
			returnFee = 0.25 * fee;
		} else if (subject.equals("jspprogram")) {
			returnFee = 0.20 * fee;
		} else {
			System.out.println("그런 과정명은 없습니다");
		}
	}

	public void print() {
		System.out.printf("%s 씨의 과정명은 %s 이고 교육비는 %d 이며 환급금은 %.1f 입니다.\n",
				name, subject, fee, returnFee);
	}


	public static void main(String args[]) {
		 Student stu = new Student("장동건", "jspprogram", 500000);
		 stu.calcReturnFee();
		 stu.print();
	}
}