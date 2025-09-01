package practice01_interface.prob01;

import java_basic.javabasic_02.day12.homework._1.Cheatable;

public class Chicken extends Animal implements Cheatable {


	Chicken(int speed){
		this.speed = speed;
	}

	@Override
	void run(int hours) {
            distance += (double) speed*hours;
	}

	@Override
	public void fly() {
             this.speed*=2;         //super.speed = super.speed*2;
	}
}
