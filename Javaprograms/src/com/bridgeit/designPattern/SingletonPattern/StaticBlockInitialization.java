/*************************************************************************************************************
 * Purpose: Singleton design Pattern-Static Block Initialization
 *        
 * @author bridgeit
 * 
 * Date: 24/03/18
 * 
 **************************************************************************************************************/
package com.bridgeit.designPattern.SingletonPattern;

public class StaticBlockInitialization 
{
    private static StaticBlockInitialization instance;
    
    private StaticBlockInitialization(){}
    
    
    static
    {
	        try
	        {
	            instance = new StaticBlockInitialization();
	        }
	        catch(Exception e)
	        {
	            throw new RuntimeException("Exception occured in creating singleton instance");
	        }
    }
    
    public static StaticBlockInitialization getInstance()
    {
        return instance;
    }
}
