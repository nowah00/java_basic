package javabasic_02.day13.morning;

public interface RemoteControl {

    //최대볼륨 30
    public static final int MAX_VOLUME = 30;

    //최대볼륨 0
    public static final int MIN_VOLUME = 0;

    public void turnOn(); // 전원 켜기
    public void turnOff(); // 전원 끄기

    public void setVolume(int volume);
    public void setMute(boolean mute);

    //디폴트 인스턴스 메소드
//    default void setMute(boolean mute){
//        if (mute){
//            System.out.println("음소거");
//            setVolume(MIN_VOLUME);
//        } else {
//            System.out.println("음소거 해제");
//        }
        //coolDown();
//    }

    //정정메소드
    static void changeBattery(){
        System.out.println("리모콘 건전지를 교체해야합니다.");
        // 정적 필드, private static method 가능

        System.out.println(MIN_VOLUME);
        // setMute(true); 인스턴스 메서드, 디폴트 메서드, private 메소드 호출 불가
    }





}

