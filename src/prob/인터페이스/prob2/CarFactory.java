package prob.인터페이스.prob2;

public class CarFactory extends Factory implements IWorkingTogether {

    CarFactory(String factoryName, int openHour, int closeHour){
        super(factoryName, openHour, closeHour);
    }

    @Override
    public int makeProducts(char skill) {
        if (skill == 'A') {
            return 3 * this.getWorkingTime();
        } else if (skill == 'B') {
            return 2 * this.getWorkingTime();
        } else if (skill == 'C') {
            return 1 * this.getWorkingTime();
        } return 0;
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        return makeProducts('B');
    }
}

