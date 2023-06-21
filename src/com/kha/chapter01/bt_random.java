package com.kha.chapter01;

public class bt_random {

	public static void main(String[] args) {
		int max=19;
		int min=14;
		int range = (max-min)+1;
		int randomNumber=0;
		randomNumber=(int)(Math.random()*range)+min;
		System.out.println(+randomNumber);
		
	}
}
