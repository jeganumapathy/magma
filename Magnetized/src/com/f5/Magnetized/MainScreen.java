package com.f5.Magnetized;

import com.atom.lib.AbstractScreen;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

public class MainScreen extends AbstractScreen {

	MagnetizedGame game;
	ShapeRenderer shapeRenderer;

	public MainScreen(MagnetizedGame game) {
		this.game = game;
		this.shapeRenderer = new ShapeRenderer();
	}

	@Override
	public void render(float delta) {
		super.render(delta);
		game.batch.setProjectionMatrix(game.camera.combined);
		game.batch.begin();
		game.batch.end();

	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void show() {
	}

	@Override
	public void hide() {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}

	@Override
	public void dispose() {
	}

}
