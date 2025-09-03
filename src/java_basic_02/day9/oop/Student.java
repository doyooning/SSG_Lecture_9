package java_basic_02.day9.oop;

public class Student {
    private String stu_name;
    private Integer stu_age;
    private String address;
    private String stu_ssn;
    private int[] scores = {90, 80, 70};

    // 생성자 메서드
    Student(String stu_name, String stu_ssn) {
        this.stu_name = stu_name;
        this.stu_ssn = stu_ssn;
    }

    Student(String stu_name, Integer stu_age, String address, String stu_ssn) {
        this.stu_name = stu_name;
        this.stu_ssn = stu_ssn;
        this.stu_age = stu_age;
        this.address = address;
    }

    public String getStu_name() {
        return stu_name;
    }

    public Integer getStu_age() {
        return stu_age;
    }

    public String getAddress() {
        return address;
    }

    public String getStu_ssn() {
        return stu_ssn;
    }

    public int[] getScores() {
        return scores;
    }
}
