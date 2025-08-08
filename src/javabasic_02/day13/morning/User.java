package javabasic_02.day13.morning;

public class User {

    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television();
        rc.turnOn();
        rc.setVolume(10);
        rc.setVolume(11);
        rc.setMute(true);
        rc.setMute(false);
        RemoteControl.changeBattery();





        // 리모콘을 통해서 청소기를 동작시키려한다.
        // 1. 전원을 키고
        // 2. 청소를 10분 시킨다.
        // 3. 청소 10분 후 청소기를 끈다.


        // TV 최대볼륨 확인 public static final은 타입.상수명 바로 접근하여 상수값읽음.
//        System.out.println(RemoteControl.MAX_VOLUME);
        // TV 최소볼륨 확인
//        System.out.println(RemoteControl.MIN_VOLUME);
    }
}
