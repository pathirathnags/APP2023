package me.rajpp;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

//used to extend ApplicationAdapter
public class MenuScreen extends ScreenAdapter implements Screen, ApplicationListener{
	
	SpriteBatch batch;
	Texture img;
	
	HelloWorldGame game;
	//Constructor
	
	
	  @Override 
	  public void create() 
	  { 
		  batch = new SpriteBatch(); 
		  img = new Texture("desertbackground.png"); 
	  }
	 
	
	public MenuScreen(HelloWorldGame game) {
		this.game = game;
	}


    public void render(float delta) {
        //Gdx.gl.glClearColor(0, .25f, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        

        if(Gdx.input.isKeyPressed(Input.Keys.R)){
        	game.setScreen(new DisplayRules(game));
        }
        
        if(Gdx.input.isKeyPressed(Input.Keys.ENTER)){
        	game.setScreen(new MyGdxGame(game));
        }
        
        game.batch.begin();
        game.font.draw(game.batch, "Welcome to the Egyptian Slap game!", Gdx.graphics.getWidth() * .25f, Gdx.graphics.getHeight() * .75f);
        game.font.draw(game.batch, "Press R to see the rules to the game...", Gdx.graphics.getWidth() * .25f, Gdx.graphics.getHeight() * .5f);
        game.font.draw(game.batch, "Press ENTER to play.", Gdx.graphics.getWidth() * .25f, Gdx.graphics.getHeight() * .25f);
        game.batch.end();
    }
	
	
    public void hide(){
        Gdx.input.setInputProcessor(null);
    }


	@Override
	public void render() {
		// TODO Auto-generated method stub
		
	}

}
