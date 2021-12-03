package com.cs3343_Group16.greedySnake.service.impl.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import com.cs3343_Group16.greedySnake.model.*;
import com.cs3343_Group16.greedySnake.service.KeyCommand;
import com.cs3343_Group16.greedySnake.service.impl.*;
import com.cs3343_Group16.greedySnake.system.SConstant;

import static org.junit.Assert.*;

public class TestPressDownKeyCommand {
	
	@BeforeEach
	void setUp() throws Exception {
	}
	
	
	@Test
	public void testGetInstance() {
		KeyCommand p=PressDownKeyCommand.getInstance();
		assertEquals(PressDownKeyCommand.class,p.getClass());
	}

	@Test
	public void testExecute() {
		Game g=new Game();
		g.setMode(SConstant.SC_GAME_MODE_PlAYER);
		PressDownKeyCommand.getInstance().execute(g);
		
		assertEquals(SConstant.SC_SNAKE_MOVE_DIRECTION_DOWN_FLAG,g.getSnake().getDirection());
	}
}