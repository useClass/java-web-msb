package com.bjsxt.proxy;
import java.util.Random;


public class Tank implements Moveable{


	@Override
	public void move() {
		System.out.println("Tank moving ....");
		try {
			Thread.sleep(new Random().nextInt(1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

		
	}

}
