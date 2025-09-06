package java_basic_02.day11.test250806.test03;

public class Emp {
    private String id;
    private String name;
    private int baseSalary;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getSalary(double bonus) {
        return baseSalary + baseSalary * bonus;
    }

    public String toString() {
        return String.format("%s(%s) 사원의 기본급은 %d원 입니다.", getName(), getId(), getBaseSalary());
    }
}
