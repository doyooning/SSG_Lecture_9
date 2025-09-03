package java_basic_02.day6;
/*
* ==, != 연산자는 변수의 값이 같은지, 아닌지를 조사
* 참조타입 변수의 값은 객체의 주소(번지)이므로
* 참조타입 변수의 ==, != 비교는 주소값을 비교하는 것
* */
public class PrimitiveEqualType {
    public static void main(String[] args) {
        // 정수형 배열 arr1, arr2, arr3 선언
        int[] arr1;
        int[] arr2;
        int[] arr3;

        // 정수형 배열 arr1, arr2, arr3 메모리 생성

        arr1 = new int[3];
        arr2 = new int[3];
        arr3 = new int[3];

        System.out.println(arr1.length);
        System.out.println(arr2.length);
        System.out.println(arr3.length);

        arr1[0] = 1;
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);

        arr1[1] = 3;
        System.out.println(arr1[1]);

        // arr3에 1, 2, 3 할당, 결과 확인
        arr1[1] = 2;
        arr1[0] = 1;
        arr1[2] = 3;
        System.out.println("===============");
        // iter 자동완성
        for (int i : arr1) {
            System.out.println(i);
        }

        System.out.println("===============");
        // itar 자동완성
        for (int i = 0; i < arr1.length; i++) {
            int i1 = arr1[i];
            System.out.println(i);
        }
    }
}
