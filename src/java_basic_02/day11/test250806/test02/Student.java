package java_basic_02.day11.test250806.test02;

public class Student {
    private String name;
    private int age;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void print() {
        System.out.printf("이   름 : %s    나 이 : %d   학   번 : %s\n", getName(), getAge(), getId());
    }
}
