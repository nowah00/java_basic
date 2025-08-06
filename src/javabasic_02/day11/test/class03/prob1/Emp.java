package javabasic_02.day11.test.class03.prob1;

public class Emp {
    private String id;
    private String name;
    private int baseSalary;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getSalary(double bonus){
        double salary = baseSalary + baseSalary * bonus;
        return salary;
    }

    @Override
    public String toString(){
        return this.name + "(" + this.id + ")" + " 사원의 기본급은 " + this.baseSalary + "원 입니다.";
    }


}
