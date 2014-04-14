package com.f5.Magnetized;

import com.atom.lib.AbstractGame;
import com.atom.lib.GameObject;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

public class MagneticPoints extends GameObject {
	AbstractGame game;
	ShapeRenderer shapeRenderer;

	public MagneticPoints(AbstractGame game) {
		super(20, 20, 20, 20);
		this.game = game;
		this.shapeRenderer = game.shapeRenderer;
	}

	public void draw() {
		shapeRenderer.setProjectionMatrix(game.camera.combined);
		shapeRenderer.begin(ShapeType.FilledRectangle);
		shapeRenderer.setColor(Color.WHITE);
		shapeRenderer.filledRect(position.x, position.y, bounds.width,
				bounds.height);
		shapeRenderer.end();
	}
}
