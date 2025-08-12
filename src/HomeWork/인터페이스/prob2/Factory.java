package HomeWork.인터페이스.prob2;

public abstract class Factory {
    public int openHour;
    public int closeHour;
    public String factoryName;
    public int workingTime;

    Factory(String factoryName, int openHour, int closeHour){
        this.factoryName = factoryName;
        this.openHour = openHour;
        this.closeHour = closeHour;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public int getWorkingTime() {
        this.workingTime = this.closeHour - this.openHour;
        return this.workingTime;
    }

    public abstract int makeProducts(char skill);
}
