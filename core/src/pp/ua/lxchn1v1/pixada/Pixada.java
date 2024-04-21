package pp.ua.lxchn1v1.pixada;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class Pixada extends Game {
	public SpriteBatch batch;
	public BitmapFont font;
	public Preferences prefs;
	
	@Override
	public void create() {
		prefs = Gdx.app.getPreferences("Pixada");

		this.setScreen(new HomeScreen(this));
	}

	@Override
	public void render() {
		super.render();
	}

	@Override
	public void dispose() {

	}
}
