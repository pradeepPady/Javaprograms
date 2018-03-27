package com.bridgeit.designPattern.ObserverDesignPattern;

public interface Observer {

	public void update();
	
	//attach with subject to observe
	public void setSubject(Subject sub);
}