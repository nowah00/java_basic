package java01_interface.InterfaceProb.prob1;

public class Chicken extends Animal implements Cheatable {

    Chicken(int speed){
        super(speed);
    }

    @Override
    public void run(double hour) {
        this.distance =(double) this.speed * hour;
    }

    @Override
    public void fly(double hour) {
        this.distance =(double) (this.speed * 2) * hour;
    }
}
