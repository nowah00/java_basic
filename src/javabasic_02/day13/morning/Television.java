package javabasic_02.day13.morning;

public class Television implements RemoteControl {
    //필드 Volume 추가
    public int volume;

    //필드 volume 은 버튼을 통해 음량 조절 가능
    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV의 볼륨 : " + this.volume);
    }

    private int memoryVolume; // 뮤트 전 원래 볼륨값 저장

    @Override
    public void setMute(boolean mute) {
        if (mute){
            this.memoryVolume = this.volume;
            System.out.println("음소거");
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("음소거 해제");
            setVolume(this.memoryVolume);
        }
    }

    @Override
    public void turnOn() {
        System.out.println("TV 전원을 켠다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV 전원을 끈다.");
    }
}
