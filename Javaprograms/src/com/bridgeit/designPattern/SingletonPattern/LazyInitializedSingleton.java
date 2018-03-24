/*************************************************************************************************************
 * Purpose: Singleton design Pattern-Lazy Initialized Singleton
 *        
 * @author bridgeit
 * 
 * Date: 24/03/18
 * 
 **************************************************************************************************************/
package com.bridgeit.designPattern.SingletonPattern;

public class LazyInitializedSingleton 
{
    private static LazyInitializedSingleton instance;
    
    private LazyInitializedSingleton(){}
    
    public static LazyInitializedSingleton getInstance()
    {
        if(instance == null)
        {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
