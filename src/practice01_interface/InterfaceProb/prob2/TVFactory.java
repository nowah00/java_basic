package practice01_interface.InterfaceProb.prob2;

public class TVFactory extends Factory implements IWorkingTogether {

    TVFactory(String factoryName, int openHour, int closeHour){
        super(factoryName, openHour, closeHour);
    }

    @Override
    int makeProducts(char skill) {
        if (skill == 'A') {
            return 8 * this.getWorkingTime();
        } else if (skill == 'B') {
            return 5 * this.getWorkingTime();
        } else if (skill == 'C') {
            return 3 * this.getWorkingTime();
        } return this.getWorkingTime();
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        return makeProducts('C');
    }
}
