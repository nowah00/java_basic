package HomeWork.InterfaceProb.prob1;

public abstract class Animal {
    public int speed;
    public double distance;

    Animal(int speed){
        this.speed = speed;
    }

    public abstract void run(double hour);

    public double getDistance() {
        return distance;
    }
}

