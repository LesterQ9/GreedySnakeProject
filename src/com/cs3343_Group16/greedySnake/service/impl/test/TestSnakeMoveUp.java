package com.cs3343_Group16.greedySnake.service.impl.test;


import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cs3343_Group16.greedySnake.model.Snake;
import com.cs3343_Group16.greedySnake.model.details.AISnake;
import com.cs3343_Group16.greedySnake.model.details.PlayerSnake;
import com.cs3343_Group16.greedySnake.service.SnakeMove;
import com.cs3343_Group16.greedySnake.service.impl.SnakeMoveUp;
import com.cs3343_Group16.greedySnake.system.SConstant;

class TestSnakeMoveUp {

	@BeforeEach
	void setUp() throws Exception {
	}

	
	//Test case that snake head moves 1 unit (25 pixels) towards up.
	@Test
	public void test_moveUp_1() {
		Snake snake = PlayerSnake.getInstance();
		SnakeMove move = new SnakeMoveUp();
		move.move(snake);
		int result = snake.getHeadYPos();
		assertEquals(SConstant.SC_SNAKE_AVAIL_MAX_YPOS, result);
	}
		
	@Test
	public void test_moveUp_2() {
		Snake snake = PlayerSnake.getInstance();
		snake.setYCoordinate(0, SConstant.SC_SNAKE_AVAIL_MAX_YPOS);
		SnakeMove move = new SnakeMoveUp();
		move.move(snake);
		int result = snake.getHeadYPos();
		assertEquals(SConstant.SC_SNAKE_AVAIL_MAX_YPOS-SConstant.SC_DEFAULT_NODE_SIZE, result);
	}

	@Test
	public void test_moveUp_3() {
		Snake snake = AISnake.getInstance();
		//snake.setXCoordinate(0, 60);
		SnakeMove move = new SnakeMoveUp();
		ArrayList<ArrayList<Integer>> dummySnake = snake.clone();
		int dummyLength = snake.getLength();
		ArrayList<ArrayList<Integer>> result = move.dummyMove(dummySnake, dummyLength);
		int result_YPos=result.get(0).get(1);
		assertEquals(SConstant.SC_SNAKE_AVAIL_MAX_YPOS, result_YPos);
	}
	
	@Test
	public void test_moveUp_4() {
		Snake snake = AISnake.getInstance();
		snake.setXCoordinate(0, SConstant.SC_SNAKE_AVAIL_MAX_XPOS+SConstant.SC_DEFAULT_NODE_SIZE);
		SnakeMove move = new SnakeMoveUp();
		ArrayList<ArrayList<Integer>> dummySnake = snake.clone();
		int dummyLength = snake.getLength();
		ArrayList<ArrayList<Integer>> result = move.dummyMove(dummySnake, dummyLength);
		int result_YPos=result.get(0).get(1);
		assertEquals(SConstant.SC_SNAKE_AVAIL_MAX_YPOS-SConstant.SC_DEFAULT_NODE_SIZE, result_YPos);
	}
}