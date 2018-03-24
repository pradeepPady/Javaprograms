/*************************************************************************************************************
 * Purpose:Factory design pattern computer super class
 *        
 * @author bridgeit
 * 
 * Date: 24/03/18
 * 
 **************************************************************************************************************/
package com.bridgeit.designPattern.FactoryDesignPattern;
public abstract class Computer 
{
	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	

	public String toString()
	{
		return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
	}
}
