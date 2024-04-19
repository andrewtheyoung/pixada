package pp.ua.lxchn1v1.pixada;

import com.badlogic.gdx.Game;

public class Pixada extends Game {

	public void create() {
		this.setScreen(new HomeScreen(this));
	}

	public void render() {
		super.render();
	}

	public void dispose() {

	}
}
