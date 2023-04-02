package me.rajpp;

import java.util.Random;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.Screen;


/*import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;*/


public class MyGdxGame extends ApplicationAdapter implements Screen{
	
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

	
	SpriteBatch batch;
	BitmapFont font;
	//Texture img = new Texture(Gdx.files.internal("desertbackground.png"));

	DeckStack playerDeck;
	DeckStack botDeck;
	DeckStack middleDeck;
	
	TextureAtlas textureAtlas;
	HelloWorldGame game;
	
    OrthographicCamera camera;
    ExtendViewport viewport;
	
	//Sprite sprite = textureAtlas.createSprite("AceOfClubs");
	Sprite AceOfClubs;
	
	public MyGdxGame(HelloWorldGame game) {
		this.game = game;
	}
	
	  @Override public void render(float delta) { 
		  Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		  //everything will be displayed here!!
		  
		  
		  //win and lose condition
		  //can also do a button my gdx.input.getX() or getY()
	        if(Gdx.input.isKeyPressed(Input.Keys.Q)){
	        	game.setScreen(new EndScreen(game));
	        }
	        
	        //calling start Game
	        startGame();

	        game.batch.begin();
	       // drawSprite("AceOfClubs", 0 ,0);
	        
	        game.batch.draw(AceOfClubs, 0, 0);
	        //game.batch.draw(img, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
	        game.font.draw(game.batch, "Press Q to quit :(", Gdx.graphics.getWidth() * .25f, Gdx.graphics.getHeight() * .75f);
	        
	        game.batch.end();
	  }
	 
		@Override
		public void create () {
			camera = new OrthographicCamera();
	        viewport = new ExtendViewport(800, 600, camera);
	        
			//textureAtlas = new TextureAtlas("sprites.txt");
			AceOfClubs = textureAtlas.createSprite("AceOfClubs");
			
			font = new BitmapFont();
			batch = new SpriteBatch();
		}
		
		
		private void drawSprite(String card, float x, float y) {
		    Sprite sprite = textureAtlas.createSprite(card);

		    sprite.setPosition(x, y);

		    sprite.draw(batch);
		}
		
	@Override
	public void hide() {
		Gdx.input.setInputProcessor(null);
		
	}

	public void startGame()
	{
	    playerDeck = new DeckStack();
	    botDeck = new DeckStack();
	    middleDeck = new DeckStack();
	    
	    initalize();
	   
	}
	

	
	@Override
	public void dispose () {
		batch.dispose();
		//img.dispose();
		textureAtlas.dispose();
	}
	
	
	public void initalize()
	{
	    DeckStack originalDeck = new DeckStack();
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



	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}

