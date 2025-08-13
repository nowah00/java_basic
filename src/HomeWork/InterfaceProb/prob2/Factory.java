package HomeWork.InterfaceProb.prob2;

public abstract class Factory {
    private int openHour;
    private int closeHour;
    private String factoryName;
    private int workingTime;

    Factory(String factoryName, int openHour, int closeHour){
        this.factoryName = factoryName;
        this.openHour = openHour;
        this.closeHour = closeHour;
    }

    String getFactoryName() {
        return factoryName;
    }

    int getWorkingTime() {
        return this.closeHour - this.openHour;
    }

    abstract int makeProducts(char skill);
}
