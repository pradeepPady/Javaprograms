package com.bridgeit.designPattern.VisiterDesignPattern;

interface ShoppingCartVisitor 
{
  
    int visit(Book book);
    int visit(Fruit fruit);
}