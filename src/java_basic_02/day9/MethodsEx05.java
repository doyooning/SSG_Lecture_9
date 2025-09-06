package java_basic_02.day9;

import java.util.Scanner;

public class MethodsEx05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("사용자 아이디 입력");
        String id = sc.nextLine();
        System.out.println("비밀번호 입력");
        String pw = sc.nextLine();
        idPwPrint(id, pw);
    }

    public static void idPwPrint(String id, String pw) {
        System.out.println("id : " + id + " " + "password : " + pw);
    }
}
