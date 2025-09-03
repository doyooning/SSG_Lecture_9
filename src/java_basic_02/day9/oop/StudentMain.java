package java_basic_02.day9.oop;

//학생 인스턴스 생성을 위한 실행 클래스
public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("김이름", 27, "서울시 강남구", "12345");
        getStuInfo(student1);
        getStuScore(student1);
    }

    public static void getStuInfo(Student student) {
        System.out.println("<<학생 정보>>");
        System.out.printf("이름 : %s  나이 : %d  주소 : %s  학번 : %s\n",
                student.getStu_name(),
                student.getStu_age(),
                student.getAddress(),
                student.getStu_ssn());
    }

    public static void getStuScore(Student student) {
        System.out.println("<<점수 확인>>");
        int[] N = student.getScores();
        System.out.printf("국어 : %d점, 영어 : %d점, 수학 : %d점\n", N[0], N[1], N[2]);
        int sum = 0;
        for (int i : N) {
            sum += i;
        }
        System.out.printf("총점 : %d점, 평균 : %d점", sum, sum / N.length);
    }
}
