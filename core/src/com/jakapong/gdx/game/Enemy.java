package com.jakapong.gdx.game;

import com.badlogic.gdx.math.Vector2;

public class Enemy {
	World world;
	public static final int DIRECTION_UP = 1;
    public static final int DIRECTION_RIGHT = 2;
    public static final int DIRECTION_DOWN = 3;
    public static final int DIRECTION_LEFT = 4;
    public static final int DIRECTION_STILL = 0;
    public int SPEED = 6;
    
	private static final int [][]DIR_OFFSETS = new int [][]{
		{0,0},
		{0,1},
		{1,0},
		{0,-1},
		{-1,0}
	};
	  
	private Vector2 position;
	
	public Enemy(int x, int y, World world){
		position = new Vector2(x,y);
		this.world = world;
	}
	public void move(int Direction){
		position.x +=SPEED*DIR_OFFSETS[Direction][0];
		position.y +=SPEED*DIR_OFFSETS[Direction][1];
	}
	public void setPosition(int x, int y){
		position.x = x;
		position.y = y;
	}
	public Vector2 getPosition(){
		return position;
	}
}
