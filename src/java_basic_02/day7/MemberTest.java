package java_basic_02.day7;

public class MemberTest {
    public static void main(String[] args) {

//        Member m1 = new Member();
//        ss_health1.name = "홍길동";
//        ss_health1.age = 30;
//        ss_health1.tel = "010-1111-111";
//        ss_health1.email = "fc@naver.com";
//        ss_health1.address = "서울";
//        ss_health1.weight = 57.6;

//        Member m2 = new Member();
//        ss_health2.name = "김진명";
//        ss_health2.age = 32;
//        ss_health2.tel = "010-1111-2222";
//        ss_health2.email = "gm@naver.com";
//        ss_health2.address = "서울";
//        ss_health2.weight = 60.8;

//        Member[] 삼성 = new Member[2];
//        삼성[0] = ss_health1;
//        삼성[1] = ss_health2;
//
//        for (int i = 0; i < 삼성.length; i++) {
//            Member member = 삼성[i];
//            System.out.println(member.name);
//        }
//
//        for (Member member : 삼성) {
//            System.out.println(member.name);
//        }

        Member m3 = Member.getInstance();
        Member m4 = Member.getInstance();
//        System.out.println(m1);
//        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
    }
}
