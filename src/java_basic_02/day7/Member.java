package java_basic_02.day7;

public class Member {
    public String name;
    public int age;
    public String tel;
    public String email;
    public String address;
    public double weight;

    private static final Member member = new Member();

    public static Member getInstance() {
        return member;
    }


}
