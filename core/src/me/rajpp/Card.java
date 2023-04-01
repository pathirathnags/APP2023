package com.badlogic.mygame;

public class Card
{
    private String suit;
    private int rank;
    
    public Card(String suit, int rank)
    {
        this.suit = suit;
        this.rank = rank;
    }
    
    public void setSuit(String newSuit)
    {
        this.suit = newSuit;
    }
    
    public void setRank(int rank)
    {
        this.rank = rank;
    }
    
    public int getRank()
    {
        return rank;
    }
    
    public String getSuit()
    {
        return suit;
    }
    
    
    
}
