package java02_exception.exceptionProb.CellPhone;

public class CellPhone {
    private String model;
    private double battery;

    CellPhone(String model){
        this.model = model;
    }

    public double getBattery() {
        return battery;
    }

    public void setBattery(double battery) {
        this.battery = battery;
    }

    void call(int time) throws IllegalArgumentException{
        if (time < 0){
            throw new IllegalArgumentException("통화시간입력오류");
        }
        System.out.println("통화시간 : " + time + "분");
        this.setBattery(this.getBattery() - time * 0.5);
        if (this.getBattery() < 0) this.setBattery(0);
    }

    void charge(int time){
        System.out.println("충전시간 : " + time + "분");
        this.setBattery(this.battery + time * 3);
        if (this.getBattery() >= 100){
            this.setBattery(100);
        }
    }

    void printBattery(){
        System.out.println("남은 배터리의 양 : " + this.getBattery());
    }
}
