package HomeWork.PolymorphismProb.prob3;

public class Truck extends Wheeler {

    Truck(String carName, int velocity, int wheelNumber){
        super(carName, velocity, wheelNumber);
    }

    @Override
    public void speedUp(int speed) {
        int newVelocity = this.velocity + 5 * speed;
        if (newVelocity>100){
            this.velocity = 100;
            System.out.println("트력의 최고속도위반으로 " + this.velocity + "으로 내립니다");
        } else {this.velocity = newVelocity;
            System.out.println("트력의 현재 속도는 " + this.velocity + "입니다");
        }

    }

    @Override
    public void speedDown(int speed) {
        int newVelocity = this.velocity - 5 * speed;
        if (newVelocity<50) {
            this.velocity = 50;
            System.out.println("트력의 최저속도위반으로 " + this.velocity + "으로 올립니다");
        } else {this.velocity = newVelocity;
            System.out.println("트력의 현재 속도는 " + this.velocity + "입니다");
        }

    }
}
