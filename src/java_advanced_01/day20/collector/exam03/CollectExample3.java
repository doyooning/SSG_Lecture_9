package java_advanced_01.day20.collector.exam03;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample3 {
	public static void main(String[] args) {
		List<Student3> totalList = new ArrayList<>();
		totalList.add(new Student3("홍길동", "남", 92));
		totalList.add(new Student3("김수영", "여", 87));
		totalList.add(new Student3("감자바", "남", 95));
		totalList.add(new Student3("오해영", "여", 93));

		List<Student3> maleList = totalList.stream()
				.filter(student -> student.getGender().equals("남"))
				.toList();
		maleList.forEach(student -> System.out.println(student.getName()));
		maleList.stream()
				.forEach(s -> System.out.println(s.getName()));
		System.out.println();

		Map<String, Integer> map = totalList.stream()
				.collect(Collectors.toMap(student -> student.getName(),
						student -> student.getScore()));
		System.out.println(map);
	}
}