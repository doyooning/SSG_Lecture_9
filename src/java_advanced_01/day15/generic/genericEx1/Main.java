package java_advanced_01.day15.generic.genericEx1;

import java.util.ArrayList;
import java.util.LinkedList;

// 중첩 타입 파라미터
public class Main {
    public static void main(String[] args) {
        // LinkedList<String>을 원소로서 저장하는 ArrayList
        ArrayList<LinkedList<String>> list = new ArrayList<LinkedList<String>>();
        LinkedList<String> node1 = new LinkedList<>();
        node1.add("딸기");
        node1.add("사과");

        LinkedList<String> node2 = new LinkedList<>();
        node2.add("바나나");
        node2.add("배");

        list.add(node1);
        list.add(node2);

        System.out.println(list);
    }
}
