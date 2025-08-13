package java_advanced_01.day15;
//AutoCloseable 인터페이스 구현한 MyResource 리소스를 try - catch - resources 블록으로 사용하여 정리함.
public class TryWithResourceEx {

    public static void main(String[] args) {
        try(MyResource resource = new MyResource("AAA")){
            String data = resource.read1();
            int value = Integer.parseInt(data);
            System.out.println(value);
            resource.close();
        }catch (Exception e){
            System.out.println("예외처리 : " + e.getMessage());
        }

        MyResource resource1 = new MyResource("BBB");
        MyResource resource2 = new MyResource("CCC");
        try(resource1; resource2) {
            String data1 = resource1.read1();
            System.out.println(data1);
            String data2 = resource2.read2();
            System.out.println(data2);
        } catch (Exception e){
            System.out.println("예외처리 : " + e.getMessage());
        }
    }
}
