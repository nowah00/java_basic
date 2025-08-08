package javabasic_02.day13.afternoon.sec01;

public class SmartTelevision implements RemoteControl, Searchable {
    @Override
    public void turnOn() {
        System.out.println("Tv On");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv Off");
    }

    @Override
    public void search(String url) {
        System.out.println(url + "Searching");
    }
}
