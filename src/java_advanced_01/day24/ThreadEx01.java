package java_advanced_01.day24;

public class ThreadEx01 {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread(); // 실행하는 스레드 객체 참조 얻기
        System.out.println(mainThread.getName() + " 실행 " + ": " + mainThread.getState());

        for (int i = 0; i < 3; i++) {
            Thread threadA = new Thread(){
                @Override
                public void run() {
                    System.out.println(getName() + "실행");
                }
            };
            threadA.start(); // getName() 메서드는 Thread의 인스턴스 메서드, Thread 이름을 리턴
        }

        Thread chatThread = new Thread(){
            @Override
            public void run() {
                System.out.println(getName() + "실행");
            }
        };
        chatThread.setName("Chatting-thread");
        chatThread.setPriority(Thread.MIN_PRIORITY);
        chatThread.start();
    }
}
