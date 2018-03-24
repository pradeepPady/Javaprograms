/*************************************************************************************************************
 * Purpose: Singleton design Pattern-Bill Pugh Singleton
 *        
 * @author bridgeit
 * 
 * Date: 24/03/18
 * 
 **************************************************************************************************************/
package com.bridgeit.designPattern.SingletonPattern;

public class BillPughSingleton
{
private BillPughSingleton(){}
    
    private static class SingletonHelper
    {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    
    public static BillPughSingleton getInstance()
    {
        return SingletonHelper.INSTANCE;
    }
}
