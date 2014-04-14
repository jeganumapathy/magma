package com.f5.Magnetized;

import com.atom.lib.AbstractGame;
import com.atom.lib.GameObject;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

public class MapWall extends GameObject {

	private ShapeRenderer shapeRenderer;
	private AbstractGame game;

	public MapWall(AbstractGame game) {
		super(0, 0, 0, 0);
		this.game = game;
		this.shapeRenderer = game.shapeRenderer;
	}

	public void draw() {
		update();
		shapeRenderer.setProjectionMatrix(game.camera.combined);
		shapeRenderer.begin(ShapeType.FilledRectangle);
		shapeRenderer.setColor(Color.WHITE);
		shapeRenderer.filledRect(position.x, position.y, bounds.width,
				bounds.height);
		shapeRenderer.end();
	}

	public void update() {
		bounds.width = Gdx.graphics.getWidth();
		bounds.height = 100;
		position.x = 0;
		position.y = (Gdx.graphics.getHeight() / 2) - (bounds.height / 2);
	}
}
