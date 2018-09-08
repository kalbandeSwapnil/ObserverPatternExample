package com.test;

public class HexObserver extends Observer {
	 public HexObserver(Subject subject) {
	        this.subject = subject;
	        this.subject.add(this);
	    }

	    public void update() {
	        System.out.println("Hex Value is :" + Integer.toHexString(subject.getState()));
	    }
}
