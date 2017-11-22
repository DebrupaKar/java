package com.generics.general;

public class Box<T>
{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T string) {
		this.t = string;
	}

	@Override
	public String toString() {
		return t + "";
	}
}

