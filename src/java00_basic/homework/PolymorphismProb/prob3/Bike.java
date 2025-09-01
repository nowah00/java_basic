package java00_basic.homework.PolymorphismProb.prob3;

public class Bike extends Wheeler {

    Bike(String carName, int velocity, int wheelNumber){
        super(carName, velocity, wheelNumber);
    }

    @Override
    public void speedUp(int speed) {
        int newVelocity = this.velocity + speed;
        if (newVelocity>40){
            this.velocity = 40;
            System.out.println("자전거의 최고속도위반으로 " + this.velocity + "으로 내립니다");
        }else {this.velocity = newVelocity;
            System.out.println("자전거의 현재 속도는 " + this.velocity + "입니다");
        }

    }

    @Override
    public void speedDown(int speed) {
        int newVelocity = this.velocity - speed;
        if (newVelocity<10){
            this.velocity = 10;
            System.out.println("자전거의 최저속도위반으로 " + this.velocity + "으로 올립니다");
        } else {this.velocity = newVelocity;
            System.out.println("자전거의 현재 속도는 " + this.velocity + "입니다");
        }

    }
}
