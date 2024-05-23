/*
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.junit.*;
public class Connect4TwistTests {

    Connect4Twist game;

    @Before
    public void setUpGame() {
        game = new Connect4Twist();
    }
    @Test
    public void testGameInitialization() {
      Assertions.assertNotNull(game);  // check of game is not null
    }

    @Test
    public void testPlayerNames() {
        game.getPlayerNames();
        Assertions.assertNotNull(game.player1Field.getText()); // make sure field is not empty
        Assertions.assertNotNull(game.player2Field.getText());
    }

    @Test
    public void testDisplayBoard() {
        game.displayBoard();
        Assertions.assertNotNull(game.frame.getComponent(1)); // check is board pane is displayed
    }

    @Test
    public void testTimerStartandStop() {
        game.startTimer();
        Assertions.assertTrue(game.time > 0); // make sure the time is increasing
        game.stopTimer();
        assertEquals(0, game.time); // check if time is reset to 0
    }

}

 */
