package javabagic_02.day11.test.class02.prob;

public class Teacher {
    private String name;
    private int age;
    private String subject;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void print(){
        System.out.printf("이  름 : %s  나 이 : %d  담당과목 : %s\n", name, age, subject);
    }
}
