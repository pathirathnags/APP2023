package me.rajpp;

import java.util.Random;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends ApplicationAdapter {
	private SpriteBatch batch;
	private Texture img;
	private DeckStack playerDeck;
	private DeckStack botDeck;
	private DeckStack middleDeck;
	
	
	private Texture backofCard1  = new Texture(Gdx.files.internal("BackofCard1.png"));
	private Texture backOfCard2 = new Texture(Gdx.files.internal("BackOfCard2.png"));
	private Texture backOfCard3 = new Texture(Gdx.files.internal("BackOfCard3.png"));
	private Texture backOfCard4 = new Texture(Gdx.files.internal("BackOfCard4.png"));


	private Texture aceOfHearts = new Texture(Gdx.files.internal("AceOfHearts.png"));
	private Texture twoOfHearts = new Texture(Gdx.files.internal("TwoOfHearts.png"));
	private Texture threeOfHearts = new Texture(Gdx.files.internal("ThreeOfHearts.png"));
	private Texture fourOfHearts = new Texture(Gdx.files.internal("FourOfHearts.png"));
	private Texture fiveOfHearts = new Texture(Gdx.files.internal("FiveOfHearts.png"));
	private Texture sixOfHearts = new Texture(Gdx.files.internal("SixOfHearts.png"));
	private Texture sevenOfHearts = new Texture(Gdx.files.internal("SevenOfHearts.png"));
	private Texture eightOfHearts = new Texture(Gdx.files.internal("EightOfHearts.png"));
	private Texture nineOfHearts = new Texture(Gdx.files.internal("NineOfHearts.png"));
	private Texture tenOfHearts = new Texture(Gdx.files.internal("TenOfHearts.png"));
	private Texture jackOfHearts = new Texture(Gdx.files.internal("JackOfHearts.png"));
	private Texture queenOfHearts = new Texture(Gdx.files.internal("QueenOfHearts.png"));
	private Texture kingOfHearts = new Texture(Gdx.files.internal("KingOfHearts.png"));
	private Texture aceOfDiamonds = new Texture(Gdx.files.internal("AceOfDiamonds.png"));
	private Texture twoOfDiamonds = new Texture(Gdx.files.internal("TwoOfDiamonds.png"));
	private Texture threeOfDiamonds = new Texture(Gdx.files.internal("ThreeOfDiamonds.png"));
	private Texture fourOfDiamonds = new Texture(Gdx.files.internal("FourOfDiamonds.png"));
	private Texture fiveOfDiamonds = new Texture(Gdx.files.internal("FiveOfDiamonds.png"));
	private Texture sixOfDiamonds = new Texture(Gdx.files.internal("SixOfDiamonds.png"));
	private Texture sevenOfDiamonds = new Texture(Gdx.files.internal("SevenOfDiamonds.png"));
	private Texture eightOfDiamonds = new Texture(Gdx.files.internal("EightOfDiamonds.png"));
	private Texture nineOfDiamonds = new Texture(Gdx.files.internal("NineOfDiamonds.png"));
	private Texture tenOfDiamonds = new Texture(Gdx.files.internal("TenOfDiamonds.png"));
	private Texture jackOfDiamonds = new Texture(Gdx.files.internal("JackOfDiamonds.png"));
	private Texture queenOfDiamonds = new Texture(Gdx.files.internal("QueenOfDiamonds.png"));
	private Texture kingOfDiamonds = new Texture(Gdx.files.internal("KingOfDiamonds.png"));
	private Texture aceOfClubs = new Texture(Gdx.files.internal("AceOfClubs.png"));
	private Texture twoOfClubs = new Texture(Gdx.files.internal("TwoOfClubs.png"));
	private Texture threeOfClubs = new Texture(Gdx.files.internal("ThreeOfClubs.png"));
	private Texture fourOfClubs = new Texture(Gdx.files.internal("FourOfClubs.png"));
	private Texture fiveOfClubs = new Texture(Gdx.files.internal("FiveOfClubs.png"));
	private Texture sixOfClubs = new Texture(Gdx.files.internal("SixOfClubs.png"));
	private Texture sevenOfClubs = new Texture(Gdx.files.internal("SevenOfClubs.png"));
	private Texture eightOfClubs = new Texture(Gdx.files.internal("EightOfClubs.png"));
	private Texture nineOfClubs = new Texture(Gdx.files.internal("NineOfClubs.png"));
	private Texture tenOfClubs = new Texture(Gdx.files.internal("TenOfClubs.png"));
	private Texture jackOfClubs = new Texture(Gdx.files.internal("JackOfClubs.png"));
	private Texture queenOfClubs = new Texture(Gdx.files.internal("QueenOfClubs.png"));
	private Texture kingOfClubs = new Texture(Gdx.files.internal("KingOfClubs.png"));
	private Texture aceOfSpades = new Texture(Gdx.files.internal("AceOfSpades.png"));
	private Texture twoOfSpades = new Texture(Gdx.files.internal("TwoOfSpades.png"));
	private Texture threeOfSpades = new Texture(Gdx.files.internal("ThreeOfSpades.png"));
	private Texture fourOfSpades = new Texture(Gdx.files.internal("FourOfSpades.png"));
	private Texture fiveOfSpades = new Texture(Gdx.files.internal("FiveOfSpades.png"));
	private Texture sixOfSpades = new Texture(Gdx.files.internal("SixOfSpades.png"));
	private Texture sevenOfSpades = new Texture(Gdx.files.internal("SevenOfSpades.png"));
	private Texture eightOfSpades = new Texture(Gdx.files.internal("EightOfSpades.png"));
	private Texture nineOfSpades = new Texture(Gdx.files.internal("NineOfSpades.png"));
	private Texture tenOfSpades = new Texture(Gdx.files.internal("TenOfSpades.png"));
	private Texture jackOfSpades = new Texture(Gdx.files.internal("JackOfSpades.png"));
	private Texture queenOfSpades = new Texture(Gdx.files.internal("QueenOfSpades.png"));
	private Texture kingOfSpades = new Texture(Gdx.files.internal("KingOfSpades.png"));

	
	
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
	    DeckStack originalDeck = new DeckStack();
	    String[] suits = {"club", "diamond", "heart", "spade"};
	    int[] rank = {1,2,3,4,5,6,7,8,9,10,11,12,13};
	    
	    for(int num: rank)
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
	    int topCard = middleDeck.peek().getRank();
	    
	    switch(topCard)
	    {
	        case 1:
	            return 4;
	        
	        case 11:
	            return 1;
	            
	        case 12:
	            return 2;
	            
	        case 13:
	            return 3;
	    }
	    return -1;
	}
	
	public boolean ifFacecard()
	{
	    int topCard = middleDeck.peek().getRank();
	    if(topCard == 1 || topCard == 11 || topCard == 12 || topCard == 13)
	    {
	        return true;
	    }
	    return false;
	}
	
	
	public boolean slapable()
	{
	    try {
	        return doubles() || marriage() || topBottom() || sandwich();
	    }
	    catch(ArrayIndexOutOfBoundsException e)
	    {
	        return false;
	    }
	}
	
	public boolean doubles()
	{
	    return middleDeck.peek().getRank() == middleDeck.get(middleDeck.size() - 2).getRank();
	}
	
	public boolean marriage()
	{
	    if(middleDeck.peek().getRank() == 13)
	    {
	        if(middleDeck.get(middleDeck.size() - 2).getRank() == 12)
	        {
	            return true;
	        }
	    }
	    else if(middleDeck.peek().getRank() == 12)
	    {
	        if(middleDeck.get(middleDeck.size() - 2).getRank() == 13)
            {
                return true;
            }
	    }
	    return false;
	}
	
	public boolean topBottom()
	{
	    return middleDeck.peek().getRank() == middleDeck.get(0).getRank();
	}
	
	public boolean sandwich()
	{
	    return middleDeck.peek().getRank() == middleDeck.get(middleDeck.size() - 3).getRank();
	}
	
	public Texture cardImage(Card card)
	{
	    int rank = card.getRank();
	    String suit = card.getSuit();
	    
//	    String[] suits = {"club", "diamond", "heart", "spade"};
//      int[] rank = {1,2,3,4,5,6,7,8,9,10,11,12,13};
	    
	    if(rank == 1)
	    {
	        if(suit.equals("heart"))
	            return aceOfHearts;
	        if(suit.equals("diamond"))
	            return aceOfDiamonds;
	        if(suit.equals("club"))
	            return aceOfClubs;
	        if(suit.equals("spade"))
	            return aceOfSpades;
	    }
	    else if(rank == 2)
        {
            if(suit.equals("heart"))
                return twoOfHearts;
            if(suit.equals("diamond"))
                return twoOfDiamonds;
            if(suit.equals("club"))
                return twoOfClubs;
            if(suit.equals("spade"))
                return twoOfSpades;
        }
	    else if(rank == 3)
        {
            if(suit.equals("heart"))
                return threeOfHearts;
            if(suit.equals("diamond"))
                return threeOfDiamonds;
            if(suit.equals("club"))
                return threeOfClubs;
            if(suit.equals("spade"))
                return threeOfSpades;
        }
	    else if(rank == 4)
        {
            if(suit.equals("heart"))
                return fourOfHearts;
            if(suit.equals("diamond"))
                return fourOfDiamonds;
            if(suit.equals("club"))
                return fourOfClubs;
            if(suit.equals("spade"))
                return fourOfSpades;
        }
	    else if(rank == 5)
        {
            if(suit.equals("heart"))
                return fiveOfHearts;
            if(suit.equals("diamond"))
                return fiveOfDiamonds;
            if(suit.equals("club"))
                return fiveOfClubs;
            if(suit.equals("spade"))
                return fiveOfSpades;
        }
	    else if(rank == 6)
        {
            if(suit.equals("heart"))
                return sixOfHearts;
            if(suit.equals("diamond"))
                return sixOfDiamonds;
            if(suit.equals("club"))
                return sixOfClubs;
            if(suit.equals("spade"))
                return sixOfSpades;
        }
	    else if(rank == 7)
        {
            if(suit.equals("heart"))
                return sevenOfHearts;
            if(suit.equals("diamond"))
                return sevenOfDiamonds;
            if(suit.equals("club"))
                return sevenOfClubs;
            if(suit.equals("spade"))
                return sevenOfSpades;
        }
	    else if(rank == 8)
        {
            if(suit.equals("heart"))
                return eightOfHearts;
            if(suit.equals("diamond"))
                return eightOfDiamonds;
            if(suit.equals("club"))
                return eightOfClubs;
            if(suit.equals("spade"))
                return eightOfSpades;
        }
	    else if(rank == 9)
        {
            if(suit.equals("heart"))
                return nineOfHearts;
            if(suit.equals("diamond"))
                return nineOfDiamonds;
            if(suit.equals("club"))
                return nineOfClubs;
            if(suit.equals("spade"))
                return nineOfSpades;
        }
	    else if(rank == 10)
        {
            if(suit.equals("heart"))
                return tenOfHearts;
            if(suit.equals("diamond"))
                return tenOfDiamonds;
            if(suit.equals("club"))
                return tenOfClubs;
            if(suit.equals("spade"))
                return tenOfSpades;
        }
	    else if(rank == 11)
        {
            if(suit.equals("heart"))
                return jackOfHearts;
            if(suit.equals("diamond"))
                return jackOfDiamonds;
            if(suit.equals("club"))
                return jackOfClubs;
            if(suit.equals("spade"))
                return jackOfSpades;
        }
	    else if(rank == 12)
        {
            if(suit.equals("heart"))
                return queenOfHearts;
            if(suit.equals("diamond"))
                return queenOfDiamonds;
            if(suit.equals("club"))
                return queenOfClubs;
            if(suit.equals("spade"))
                return queenOfSpades;
        }
	    else if(rank == 13)
        {
            if(suit.equals("heart"))
                return kingOfHearts;
            if(suit.equals("diamond"))
                return kingOfDiamonds;
            if(suit.equals("club"))
                return kingOfClubs;
            if(suit.equals("spade"))
                return kingOfSpades;
        }
	    return null; 
	}
	
	
}
