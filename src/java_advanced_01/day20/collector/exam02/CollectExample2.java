package java_advanced_01.day20.collector.exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample2 {
	public static void main(String[] args) {
		List<Student2> totalList = new ArrayList< >();
		totalList.add(new Student2("홍길동", "남", 92));
		totalList.add(new Student2("김수영", "여", 87));
		totalList.add(new Student2("감자바", "남", 95));
		totalList.add(new Student2("오해영", "여", 93));
		
		// 남, 녀 학생들의 평균 점수
		Map<String, Double> map = totalList.stream().collect(
				Collectors.groupingBy(student -> student.getGender(),
						Collectors.averagingDouble(student -> student.getScore())
				));
		System.out.println(map);


	}
}