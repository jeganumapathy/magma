/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.atom.lib;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Assets {
	public static Texture background;
	public static TextureRegion backgroundRegion;

	public static Texture items;
	public static TextureRegion mainMenu;
	public static TextureRegion pauseMenu;
	public static TextureRegion ready;
	public static TextureRegion gameOver;
	public static TextureRegion highScoresRegion;
	public static TextureRegion logo;
	public static TextureRegion soundOn;
	public static TextureRegion soundOff;
	public static TextureRegion arrow;
	public static TextureRegion pause;
	public static TextureRegion spring;
	public static TextureRegion castle;
	public static Animation coinAnim;
	public static Animation bobJump;
	public static Animation bobFall;
	public static TextureRegion bobHit;
	public static Animation squirrelFly;
	public static TextureRegion platform;
	public static Animation brakingPlatform;
	public static BitmapFont font;

	public static Music music;
	public static Sound jumpSound;
	public static Sound highJumpSound;
	public static Sound hitSound;
	public static Sound coinSound;
	public static Sound clickSound;

	public static Texture map;
	public static TextureRegion mapOneRegion;
	public static TextureRegion mapTwoRegion;
	public static TextureRegion mapThreeRegion;

	public static TextureRegion dot_one;
	public static TextureRegion dot_two;
	public static TextureRegion backgroundRegionTwo, play_btnRegion;

	public static Texture play_btn;
	public static TextureRegion play_1;// 0, 0 ,91 ,66
	public static TextureRegion play_2;// = 92, 0, 91, 65
	public static TextureRegion play_3;// = 0, 67, 89, 66

	public static Texture loadTexture(String file) {
		return new Texture(Gdx.files.internal(file));
	}

	public static void load() {
		background = loadTexture("data/bg.png");
		play_btn = loadTexture("data/play_button.png");
		play_btnRegion = new TextureRegion(play_btn, 0, 0, 183, 69);
		background.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		backgroundRegion = new TextureRegion(background, 923, 0, 550, 400);
		mainMenu = new TextureRegion(background, 1474, 0, 549, 400);
		backgroundRegionTwo = new TextureRegion(background, 923, 401, 550, 400);
		dot_one = new TextureRegion(background, 0, 0, 922, 410);
		dot_two = new TextureRegion(background, 0, 411, 922, 410);
	}

	public static void dispose() {
		if (background != null)
			background.dispose();
		backgroundRegion = null;
	}

	public static void playSound(Sound sound) {
		if (Settings.soundEnabled)
			sound.play(1);
	}

	public static void applySprite(Sprite sprite) {
		sprite.setSize(1f, 1f);
		sprite.setOrigin(sprite.getWidth() / 2, sprite.getHeight() / 2);
		sprite.setPosition(-sprite.getWidth() / 2, -sprite.getHeight() / 2);
	}

}
