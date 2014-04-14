package com.f5.Magnetized;

import com.atom.lib.AbstractScreen;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

public class MainScreen extends AbstractScreen {

	public MagnetizedGame game;
	public MapWall mapWall;
	public MagnetBall magnetBall;
	public MagneticPoints magneticPoints;
	public Line line;

	public MainScreen(MagnetizedGame game) {
		this.game = game;
		this.mapWall = new MapWall(game);
		this.magnetBall = new MagnetBall(game);
		this.magneticPoints = new MagneticPoints(game);
		this.line = new Line(game,this);
	}

	@Override
	public void render(float delta) {
		super.render(delta);
		mapWall.draw();
		magnetBall.draw();
		magneticPoints.draw();
		line.draw();
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
