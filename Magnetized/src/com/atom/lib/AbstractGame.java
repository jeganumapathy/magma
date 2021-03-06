package com.atom.lib;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public abstract class AbstractGame extends Game {
	public OrthographicCamera camera;
	public SpriteBatch batch;
	public ShapeRenderer shapeRenderer;
	public float w, h;

	@Override
	public void create() {
		//Assets.load();
		w = Gdx.graphics.getWidth();
		h = Gdx.graphics.getHeight();
		camera = new OrthographicCamera(w, h);
		camera.setToOrtho(false, w, h);
		batch = new SpriteBatch();
		shapeRenderer = new ShapeRenderer();
	}

}
