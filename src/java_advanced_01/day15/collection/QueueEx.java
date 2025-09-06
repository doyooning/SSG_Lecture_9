package java_advanced_01.day15.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<Integer> queue_int = new LinkedList<>();

        queue_int.add(1);
        queue_int.add(2);
        queue_int.add(3);
        queue_int.add(4);

        System.out.println(queue_int.poll());
        System.out.println(queue_int.poll());
        System.out.println(queue_int.poll());
        System.out.println(queue_int.poll());

        // 큐는 어디에 쓰이는가?
        // 멀티태스킹을 위한 프로세스 스케쥴링 방식 구현에 사용

    }
}
