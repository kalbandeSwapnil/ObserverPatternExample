package com.test;

public class BinaryObserver extends Observer {
	 
	public BinaryObserver(Subject subject) {
	        this.subject = subject;
	        this.subject.add(this);
	    }

	    public void update() {
	        System.out.println("Binary Value is :" + Integer.toBinaryString(subject.getState()));
	    }
}
