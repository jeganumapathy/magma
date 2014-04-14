package com.f5.Magnetized;

import com.atom.lib.AbstractGame;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class MagnetizedGame extends AbstractGame {

	
	@Override
	public void create() {
		super.create();
		setScreen(new MainScreen(this));
	}

	@Override
	public void dispose() {
		batch.dispose();
	}
}
