package com.ba.generictypes;

public class Position<Type extends Number> {

	private Type x;
	private Type y;

	public Type getX() {
		return x;
	}

	public void setX(Type x) {
		this.x = x;
	}

	public Type getY() {
		return y;
	}

	public void setY(Type y) {
		this.y = y;
	}

	public <T> void sample(T t) {
		System.out.println(t.toString());
	}
}
