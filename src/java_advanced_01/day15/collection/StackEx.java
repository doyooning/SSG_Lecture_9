package java_advanced_01.day15.collection;

// Stack 구조는 데이터를 제한적으로 접근할 수 있는 구조
// 한쪽 끝에서만 자료를 넣거나 뺄 수 있는 구조
// LIFO, FILO
// 구조 단순, 구현 용이, 데이터 저장 및 읽기 속도 빠름
// 데이터 최대 갯수를 미리 정해야 함 (저장공간의 낭비 발생 가능성)

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> stack_int = new Stack<>();
        stack_int.push(1);
        stack_int.push(2);
        stack_int.push(3);

        System.out.println(stack_int.pop());
        System.out.println(stack_int.pop());
    }
}
