//package java_advanced.day18.streamtest.prob7;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class Example {
//    public static void main(String[] args) {
//        List<Member> list = Arrays.asList(
//                new Member("홍길동","개발자"),
//                new Member("김나리","디자이너"),
//                new Member("신용권","개발자")
//        );
//
//        List<Member> developers = list.stream()
//                .filter(member -> member.getjob.equals("개발자")).collect(Collectors.toList());
//    }
//}
