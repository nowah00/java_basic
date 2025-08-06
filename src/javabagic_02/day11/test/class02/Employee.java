package javabagic_02.day11.test.class02;

public class Employee {
    private String name;
    private int age;
    private String dept;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void print(){
        System.out.printf("이  름 : %s  나 이 : %d  부  서 : %s\n", name, age, dept);
    }
}
