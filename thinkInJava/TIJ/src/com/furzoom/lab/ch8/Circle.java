package com.furzoom.lab.ch8;

public class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Circle.draw()");
	}
	@Override
	public void erase() {
		System.out.println("Circle.erase()");
	}
	@Override
	public void color() {
		System.out.println("Circle.color()");
	}
}