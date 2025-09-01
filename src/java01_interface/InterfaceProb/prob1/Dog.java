package java01_interface.InterfaceProb.prob1;

public class Dog extends Animal {

    Dog(int speed){
        super(speed);
    }

    @Override
    public void run(double hour) {
        this.distance = (double) hour / 2 * this.speed;
    }
}
