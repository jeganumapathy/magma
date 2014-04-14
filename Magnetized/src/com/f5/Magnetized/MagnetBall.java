package com.f5.Magnetized;

import com.atom.lib.AbstractGame;
import com.atom.lib.DynamicGameObject;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

public class MagnetBall extends DynamicGameObject {
	private ShapeRenderer shapeRenderer;
	private AbstractGame game;
	float i = 0f;
	boolean gameEnded;

	public MagnetBall(AbstractGame game) {
		super(0, 0, 20, 20);
		this.game = game;
		this.shapeRenderer = game.shapeRenderer;
	}

	public void draw() {
		update();
		shapeRenderer.setProjectionMatrix(game.camera.combined);
		shapeRenderer.begin(ShapeType.FilledRectangle);
		shapeRenderer.setColor(Color.BLACK);
		shapeRenderer.filledRect(position.x, position.y, bounds.width,
				bounds.height);
		shapeRenderer.end();
	}

	private void update() {
		if (!gameEnded) {
			i = i + .89f;
			if (i > Gdx.graphics.getWidth()) {
				gameEnded = true;
				reset();
			}
			position.x = i;
			position.y = (Gdx.graphics.getHeight() / 2) - ((bounds.height / 2));
		}
	}

	public void reset() {
		i = 0;
		gameEnded = false;
	}

}
