package com.cs3343_Group16.greedySnake.service.impl.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import com.cs3343_Group16.greedySnake.model.*;
import com.cs3343_Group16.greedySnake.service.KeyCommand;
import com.cs3343_Group16.greedySnake.service.impl.*;
import com.cs3343_Group16.greedySnake.system.SConstant;

import static org.junit.Assert.*;

public class TestPress2KeyCommand {
	
	@BeforeEach
	void setUp() throws Exception {
	}
	
	
	
	@Test
	public void testGetInstance() {
		KeyCommand p=Press2KeyCommand.getInstance();
		assertEquals(Press2KeyCommand.class,p.getClass());
	}

	@Test
	public void testExecute() {
		Game g=new Game();
		Press2KeyCommand.getInstance().execute(g);
		
		assertEquals(SConstant.SC_GAME_MODE_AI,g.getMode());
	}
}