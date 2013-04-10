package com.example.androidtest;

public class Ball {
	int x, y; //Bollens position
	int dx, dy; //Bollens hastighet
	
	//Konstruktor
	public Ball(){
		x = 100;
		y = 100;
		dx = 1;
		dy = 0;
	}
	
	//Rör bollen enligt dess hastighet
	public void move(){
		x += dx;
		y += dy;
	}
}
