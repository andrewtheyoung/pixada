package pp.ua.lxchn1v1.pixada;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.StretchViewport;

public class HomeScreen implements Screen {
    final Pixada app;
    private Stage stage;

    public HomeScreen(final Pixada app)
    {
        this.app = app;
        stage = new Stage(new StretchViewport(Gdx.graphics.getWidth(), Gdx.graphics.getHeight()));
    }

    @Override
    public void dispose() {
        stage.dispose();
    }

    @Override
    public void hide() {
        
    }

    @Override
    public void pause() {
        
    }

    @Override
    public void render(float delta) {
        
    }

    @Override
    public void resize(int width, int height) {
        
    }

    @Override
    public void resume() {
        
    }

    @Override
    public void show() {
        
    }
}
