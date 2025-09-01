package practice01_interface.prob01;

public abstract class Animal {
	int speed;
	double distance;
	Animal(){}
	Animal (int speed){
		this.speed=speed;
	}
	abstract void run (int hours);
	
	double getDistance(){
		return distance;
	}
}
