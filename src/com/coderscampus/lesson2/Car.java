package com.coderscampus.lesson2;

public class Car implements Product{
	private Electronics electronics;
	private Body body;
	private Frame frame;

	public Electronics getElectronics() {
		return electronics;
	}
	public void setElectronics(Electronics electronics) {
		this.electronics = electronics;
	}
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}
	public Frame getFrame() {
		return frame;
	}
	public void setFrame(Frame frame) {
		this.frame = frame;
	}
	@Override
	public Integer getPrice() {
		return 10000;
	}
	
	
}
