package me.rajpp;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;

public abstract class Game extends Object implements ApplicationListener{
	protected Screen screen;

	public void dispose () {
		if (screen != null) screen.hide();
	}

	public void pause () {
		if (screen != null) screen.pause();
	}

	public void resume () {
		if (screen != null) screen.resume();
	}

	
	  public void render () {
		  if (screen != null)
			  screen.render(Gdx.graphics.getDeltaTime());
	  }

	public void resize (int width, int height) {
		if (screen != null) screen.resize(width, height);
	}

	/** Sets the current screen. {@link Screen#hide()} is called on any old screen, and {@link Screen#show()} is called on the new
	 * screen, if any.
	 * @param screen may be {@code null} */
	public void setScreen (Screen screen) {
		if (this.screen != null) this.screen.hide();
		this.screen = screen;
		if (this.screen != null) {
			this.screen.show();
			this.screen.resize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		}
	}

	/** @return the currently active {@link Screen}. */
	public Screen getScreen () {
		return screen;
	}
}
