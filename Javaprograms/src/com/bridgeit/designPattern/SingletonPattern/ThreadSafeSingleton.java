/*************************************************************************************************************
 * Purpose: Singleton design Pattern-Thread Safe Singleton
 *        
 * @author bridgeit
 * 
 * Date: 24/03/18
 * 
 **************************************************************************************************************/
package com.bridgeit.designPattern.SingletonPattern;

public class ThreadSafeSingleton
{
private static ThreadSafeSingleton instance;
    
    private ThreadSafeSingleton(){}
    
    public static synchronized ThreadSafeSingleton getInstance()
    {
        if(instance == null)
        {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking()
    {
        if(instance == null)
        {
        	
            synchronized (ThreadSafeSingleton.class)
            {
                if(instance == null)
                {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
