package java_advanced_01.day21.practice;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

//문제 : 3명의 학생 (김철수,21,3.5), (이영희,22,3.9) (박민수, 20,3.2) 학생 정보를 students.dat파일에 저장하고 다시 읽어 출력 ex) 반 총점 = 10.6  반 평균 = 3.5 (소수 첫째자리 표현)을 출력하고 학생정보를 나이순으로 콘솔에 출력하세요
//학생정보
// 박민수 , 20세
// 김철수 , 21세
// 이영희 , 22세
public class Prob16 {
    public static void main(String[] args) throws IOException {
        String fileName = "students.txt";
        Student kim = Student.builder()
                .name("김철수")
                .age(21).score(3.5).build();
        Student lee = Student.builder()
                .name("이영희")
                .age(22).score(3.9).build();
        Student park = Student.builder()
                .name("박민수")
                .age(20).score(3.2).build();
        Student[] students = {kim, lee, park};

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            for (Student s : students) {
                dos.writeUTF(s.getName());
                dos.writeInt(s.getAge());
                dos.writeDouble(s.getScore());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        Map<String, Integer> map = new HashMap<>();
        for (Student s : students) {
            map.put(s.getName(), s.getAge());
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            double totalSum = 0;
            double totalAvg = 0.0;

            for (int i = 0; i < students.length; i++) {
                map.put(dis.readUTF(), dis.readInt());
                totalSum += dis.readDouble();
            }
            totalAvg = totalSum / students.length;
            System.out.printf("반 총점 = %.1f\n", totalSum);
            System.out.printf("반 평균 = %.1f\n", totalAvg);

        } catch (IOException e) {
            e.printStackTrace();
        }
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue()).forEach(e -> {
                    System.out.println(e.getKey() + " , " + e.getValue() + "세");
                });
    }

}
