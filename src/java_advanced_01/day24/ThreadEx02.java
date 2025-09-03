package java_advanced_01.day24;


class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    public void setMemory1(int memory) {
        this.memory = memory;
        try {
            Thread.sleep(2000); // 2초간 일시정지
        } catch (InterruptedException e) {}

        System.out.println(Thread.currentThread().getName() + " : " + this.memory);

    } // 동기화 메서드

    public void setMemory2(int memory) {
        synchronized (this) {
            this.memory = memory;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
        }
        System.out.println(Thread.currentThread().getName() + " : " + this.memory);

    } // 동기화 블럭을 포함하는 메서드
}

class User1 extends Thread {
    private Calculator calculator;

    public User1()  {
        setName("User1의 Thread");
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemory1(100);
    }
}


class User2 extends Thread {
    private Calculator calculator;

    public User2()  {
        setName("User2의 Thread");
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemory2(50);
    }
}

public class ThreadEx02 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        User1 user1 = new User1();
        User2 user2 = new User2();
        user1.setCalculator(calculator);
        user2.setCalculator(calculator);
        user1.start();
        user2.start();
    }
}
