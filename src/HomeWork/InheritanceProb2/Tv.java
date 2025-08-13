package HomeWork.InheritanceProb2;

public class Tv {
    public String color;
    public boolean power;
    public int channel;

    Tv(String color, boolean power, int channel){
        this.color = color;
        this.power = power;
        this.channel = channel;
    }

    Tv (){
        color = "black";
        power = false;
        channel = 0;
    }

    public void power(){
        if (this.power == true){
            this.power = false;
        } else {
            this.power = true;
        }
    }

    public void channelUp(){
        channel++;
    }

    public void channelDown(){
        channel--;
    }

    public void print(){
        System.out.println("color :" + this.color + "   power :" + this.power + "   channel :"+ this.channel);
    }


}
