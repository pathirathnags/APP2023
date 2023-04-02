package me.rajpp;

import java.util.Random;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class deck extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	DeckStack playerDeck;
	DeckStack botDeck;
	DeckStack middleDeck;
	
	
	public void startGame()
	{
	    playerDeck = new DeckStack();
	    botDeck = new DeckStack();
	    middleDeck = new DeckStack();
	    
	    initalize();
	   
	}
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
	
	
	public void initalize()
	{
	    DeckStack originalDeck;
	    String[] suits = {"club", "diamond", "heart", "spade"};
	    int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13};
	    
	    for(int num: numbers)
	    {
	        for(String suit: suits)
	        {
	            originalDeck.push(new Card(suit, num));
	        }
	    }
	    
	    DeckStack shuffledDeck = randomize(originalDeck);
	    
	    for(int i = 0; i < 52; i++)
	    {
	        playerDeck.push(shuffledDeck.pop());
	        botDeck.push(shuffledDeck.pop());
	    }
        
	    
	    
	}
	
	public DeckStack randomize(DeckStack deck)
	{
	    Random rand = new Random();
	    
	    DeckStack newDeck = new DeckStack();
	    int findCard;
	    
	    for(int i = 0; i < 52; i++)
	    {
	        findCard = rand.nextInt(deck.size());
	        newDeck.push(deck.pop(findCard));
	    }
	    
	    return newDeck;     
	}
	
	
	public int findDrawAmount()
	{
	    int topCard = middleDeck.peek().getNumber();
	    
	    switch(topCard)
	    {
	        case 1:
	            return 4;
	            break;
	        
	        case 11:
	            return 1;
	            break;
	            
	        case 12:
	            return 2;
	            break;
	            
	        case 13:
	            return 3;
	            break;
	    }
	    
	}
	
	public boolean ifDrawable()
	{
	    int topCard = middleDeck.peek().getNumber();
	    if(topCard == 1 || topCard == 11 || topCard == 12 || topCard == 13)
	    {
	        return true;
	    }
	    return false;
	}
	
	public boolean slapable()
	{
	    try {
	        return topBottom() || doubles() || marriage() || sandwich();
	    }
	    catch(ArrayIndexOutOfBoundsException e)
	    {
	        return false;
	    }
	    
	}
	
	public boolean topBottom()
    {
        return (middleDeck.peek().getRank() == middleDeck.get(0).getRank());
    }
	
    public boolean doubles()
    {
        return (middleDeck.peek().getRank() == middleDeck.get(middleDeck.size() - 2).getRank());
    }
    
    public boolean marriage()
    {
        if(middleDeck.peek().getRank() == 12)
        {
            if(middleDeck.get(middleDeck.size() - 2).getRank() == 13)
            {
                return true;
            }
        }
        else if(middleDeck.peek().getRank() == 13)
        {
            if(middleDeck.get(middleDeck.size() - 2).getRank() == 12)
            {
                return true;
            }
        }
        return false;
    }
    
    public boolean sandwich()
    {
        return (middleDeck.peek().getRank() == middleDeck.get(middleDeck.size() - 3).getRank());
    }
}
