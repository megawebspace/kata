package gol;

import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

public class GameTest {
	
	private Game game;

	@Before
	public void setUp() {
		game = new Game();
		game.createCell(1,1);
	}
	
	@Test
	public void aLonelyCellShouldDie() throws Exception {
		assertFalse(game.isAliveInNextGeneration(1,1));
	}
	
}
