package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_연습문제8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        int aSize = 0;
        int bSize = 0;

        char[] ac = a.toCharArray();
        char[] bc = b.toCharArray();

        for (int i = 0; i < ac.length; i++) {
            if (i == bc.length) {
                break;
            }
            aSize += ac[i];
        }

        for (int i = 0; i < bc.length; i++) {
            if (i == ac.length) {
                break;
            }
            bSize += bc[i];
        }

        //출력
        System.out.println(aSize >= bSize ?
                a + " 가(이) 더 큽니다." : b + " 가(이) 더 큽니다.");
        System.out.println(a.substring(0, 3).equals(b.substring(0, 3)) ?
                "앞의 세 문자가 같습니다." : "앞의 세 문자가 같지 않습니다.");
    }
}
