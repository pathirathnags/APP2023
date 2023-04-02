package me.rajpp;

import java.util.ArrayList;

public class DeckStack
{
    ArrayList<Card> deck;
    
    public DeckStack()
    {
        deck = new ArrayList<Card>();
    }
        
    public void push(Card value)
    {
        deck.add(value);
    }
    
    public Card peek()
    {
        return deck.get(deck.size() - 1);
    }
    
    public Card pop()
    {
        if(!isEmpty())
        {
            Card popValue = deck.get(deck.size() - 1);
            deck.remove(deck.size() - 1);
            return popValue;
        }
        return null;
    }
    
    public Card pop(int index)
    {
        if(!isEmpty())
        {
            Card popValue = deck.get(index);
            deck.remove(index);
            return popValue;
        }
        return null;
    }
    
    public boolean isEmpty()
    {
        return deck.isEmpty();
    }
    
    public int size()
    {
        return deck.size();
    }
    
    public Card get(int index)
    {
        return deck.get(index);
    }
    
    
    
    
    
    
}
