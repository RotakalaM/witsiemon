package game.com.java.controller;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputAdapter;

import game.com.java.model.Actor;
import game.com.java.model.DIRECTION;

public class PlayerController extends InputAdapter{
	
	private Actor player;
	private boolean up, down, left, right;
	
	public PlayerController(Actor p) {
		this.player = p;
	}
	
	@Override
	public boolean keyDown(int keycode) {
		
		if(keycode == Keys.UP) {
			up = true;
		}
		if(keycode == Keys.DOWN) {
			down = true;
		}
		if(keycode == Keys.LEFT) {
			left = true;
		}
		if(keycode == Keys.RIGHT) {
			right = true;
		}
		return false;
	}
	
	@Override
	public boolean keyUp(int keycode) {
		if(keycode == Keys.UP) {
			up = false;
		}
		if(keycode == Keys.DOWN) {
			down = false;
		}
		if(keycode == Keys.LEFT) {
			left = false;
		}
		if(keycode == Keys.RIGHT) {
			right = false;
		}
		return false;
	}
	
	public void update(float delta) {
		if(up) {
			player.move(DIRECTION.NORTH);
			return;
		}
		
		if(down) {
			player.move(DIRECTION.SOUTH);
			return;
		}
		
		if(left) {
			player.move(DIRECTION.WEST);
			return;
		}
		
		if(right) {
			player.move(DIRECTION.EAST);
			return;
		}
	}
}