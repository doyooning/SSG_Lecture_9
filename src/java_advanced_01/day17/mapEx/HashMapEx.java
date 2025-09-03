package java_advanced_01.day17.mapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        // 객체 저장 (INSERT, CREATE, SAVE)
        map.put("A", 1);
        map.put("B", 1);
        map.put("C", 1);
        map.put("D", 1);

        System.out.println(map.size());

        // 객체 읽기 (Read, Get) ==> Key를 이용하여 읽기
        String key = "A";
        int value = map.get(key);
        System.out.println("키를 이용하여 값 확인 " + value);
        System.out.println();

        Set<String> keyset = map.keySet();
        Iterator<String> iterator = keyset.iterator();
        // 키 반복을 위해 반복자를 생성

        while (iterator.hasNext()) {
            String key1 = iterator.next();
            Integer value1 = map.get(key1);
            System.out.println(key1 + "," + value1);
        }
        System.out.println();

        // Entry Set 컬렉션을 얻고 반복하여 키와 값 얻기
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + "," + v);
        }

        System.out.println();

        // 키로 엔트리 삭제
        map.remove("B");
        System.out.println(map.size());
        System.out.println();
    }
}
