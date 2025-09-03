package java_advanced_01.day15.collection;

public class StringArrayEx {
    public static void main(String[] args) {
        Integer[][][] data_list = { // 2, 2, 3
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {7, 8, 9},
                        {10, 11, 12}
                }
        };
        System.out.println(data_list[1][1][2]);
    }
}
