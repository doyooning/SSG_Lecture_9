package java_advanced_01.day15;

public class TryWithResourceEx {
    public static void main(String[] args) {
        try (MyResource resource = new MyResource("AAA")){
            String data = resource.read1();
            int value = Integer.parseInt(data);
            System.out.println(value);
        } catch (Exception e) {
            System.out.println("예외처리 : " + e.getMessage());
        }

        try (MyResource resource = new MyResource("BBB")){
            String data = resource.read2();
            int value = Integer.parseInt(data);
            System.out.println(value);
        } catch (Exception e) {
            System.out.println("예외처리 : " + e.getMessage());
        }

        MyResource res1 = new MyResource("CCC");
        MyResource res2 = new MyResource("DDD");

        try (res1; res2){
            String data1 = res1.read1();
            String data2 = res2.read2();
            int value = Integer.parseInt(data1);
            System.out.println(value);
        } catch (Exception e) {
            System.out.println("예외처리 : " + e.getMessage());
        }
    }
}
