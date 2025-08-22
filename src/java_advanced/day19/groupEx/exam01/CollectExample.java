package java_advanced.day19.groupEx.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
	
public class CollectExample {
	public static void main(String[] args) {
		List<Student> totalList = new ArrayList< >();
		totalList.add(new Student("홍길동", "남", 92));
		totalList.add(new Student("김수영", "여", 87));
		totalList.add(new Student("감자바", "남", 95));
		totalList.add(new Student("오해영", "여", 93));
		
		//남학생만 묶어 List 생성
		Map<String,List<Student>> map = totalList.stream().collect(Collectors.groupingBy(Student::getGender));

		List<Student> maleList = map.get("남");
		maleList.stream().forEach(student -> System.out.println(student.getName()));

		System.out.println();

		List<Student> fmaleList = map.get("여");
		fmaleList.stream().forEach(student -> System.out.println(student.getName()));

	}
}