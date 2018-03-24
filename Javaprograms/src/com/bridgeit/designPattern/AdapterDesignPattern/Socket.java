package com.bridgeit.designPattern.AdapterDesignPattern;

 class Socket {

	public Volt getVolt()
	{
		return new Volt(120);
	}
}
