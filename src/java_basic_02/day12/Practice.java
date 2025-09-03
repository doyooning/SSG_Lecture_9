package java_basic_02.day12;

public class Practice {
    public static void main(String[] args) {
        String str = "SDS";
        StringBuffer sb = new StringBuffer(str);

        sb.insert(0, '#');
        System.out.println(sb);
    }
}
