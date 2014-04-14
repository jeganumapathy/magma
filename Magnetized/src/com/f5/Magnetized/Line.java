package com.f5.Magnetized;

import com.atom.lib.AbstractGame;
import com.atom.lib.GameObject;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

public class Line extends GameObject {
	private ShapeRenderer shapeRenderer;
	private AbstractGame game;
	private MainScreen screen;

	public Line(AbstractGame game,MainScreen screen) {
		super(0, 0, 0, 0);
		this.game = game;
		this.screen = screen;
		this.shapeRenderer = game.shapeRenderer;
	}

	public void draw() {
		shapeRenderer.setProjectionMatrix(game.camera.combined);
		shapeRenderer.begin(ShapeType.Line);
		shapeRenderer.setColor(Color.GRAY);
		shapeRenderer.line(screen.magneticPoints.position.x,
				screen.magneticPoints.position.y, screen.magnetBall.position.x, screen.magnetBall.position.y);
		shapeRenderer.end();
	}

}
