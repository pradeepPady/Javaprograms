package com.bridgeit.designPattern.VisiterDesignPattern;

public interface ItemElement
{
	public int accept(ShoppingCartVisitor visitor);
}
