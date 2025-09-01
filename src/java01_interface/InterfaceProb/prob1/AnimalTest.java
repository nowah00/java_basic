package java01_interface.InterfaceProb.prob1;

public class AnimalTest {

    public static void main(String[] args) {
        Animal dog = new Dog(8);
        Animal chicken = new Chicken(3);
        Chicken cheatableChicken = new Chicken(5);

        for (int i=1; i<=3; i++){
            System.out.println(i + "시간 후");
            dog.run(i);
            chicken.run(i);
            if(cheatableChicken instanceof Cheatable){
            cheatableChicken.fly(i);}
            System.out.println("개의 이동거리=" + dog.getDistance());
            System.out.println("닭의 이동거리=" + chicken.getDistance());
            System.out.println("날으는 닭의 이동거리=" + cheatableChicken.getDistance());
        }
    }
}
