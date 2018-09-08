package com.test;

public class OctObserver extends Observer {

	 public OctObserver(Subject subject) {
	        this.subject = subject;
	        this.subject.add( this );
	    }

	    public void update() {
	        System.out.println("Oct value is : " + Integer.toOctalString(subject.getState()));
	    }
}
