package me.rajpp;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;

public class EndScreen extends ScreenAdapter {

    HelloWorldGame game;

    public EndScreen(HelloWorldGame game) {
        this.game = game;
    }

    @Override
    public void render(float delta) {
        //Gdx.gl.glClearColor(.25f, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        
        if(Gdx.input.isKeyPressed(Input.Keys.M)){
        	game.setScreen(new MenuScreen(game));
        }

        game.batch.begin();
        game.font.draw(game.batch, "End of game!", Gdx.graphics.getWidth() * .25f, Gdx.graphics.getHeight() * .75f);
        game.font.draw(game.batch, "Press M to play again.", Gdx.graphics.getWidth() * .25f, Gdx.graphics.getHeight() * .25f);
        game.batch.end();

    }

    @Override
    public void hide() {
        Gdx.input.setInputProcessor(null);
    }
}
