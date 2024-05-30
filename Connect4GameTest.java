
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.swing.*;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

public class Connect4GameTest {

    private Connect4Game game;
    private JButton startButton;

    @BeforeEach
    public void setUp() {
        game = new Connect4Game();
        // Initialize the GUI components to simulate the user input
        game.loadStartScreen();
        game.getPlayerNames();

        // Fetch the button used to start the game
        startButton = (JButton) getComponentByName(game.frame, "Start Game");
    }

    @Test
    @Order(1)
    public void testGameBoardInitialization() {

    }

    @Test
    @Order(2)
    public void testPlayerTurnAlteration() {

    }

    /*
    @Test
    @Order()
    public void testWinCondition() {

    }

     */
    @Test
    @Order(3)
    public void testTimerFunctionality() {

    }

    @Test
    @Order(4)
    public void testInvalidMoveHandling() {

    }

    @Test
    @Order(5)
    public void testTieDecision() {

    }

    @Test
    @Order(6) // this test should run first to prevent timing issues
    public void testEmptyUsernames() {
        game.player1Field.setText("");
        game.player2Field.setText("");

        // Simulate button click
        startButton.doClick();

        // Verify that the error message dialog is shown
        //assertTrue(isDialogVisible());
    }

    @Test
    @Order(7)
    public void testSameUsernames() throws InterruptedException {
        game.player1Field.setText("Player");
        game.player2Field.setText("Player");

        // Simulate button click
        startButton.doClick();

        // Verify that the error message dialog is shown
        assertTrue(isDialogVisible());
    }




    private boolean isDialogVisible() {
        for (Window window : Window.getWindows()) {
            if (window instanceof JDialog) {
                JDialog dialog = (JDialog) window;
                if (dialog.isVisible()) {
                    return true;
                }
            }
        }
        return false;
    }

    private Component getComponentByName(Container container, String name) {
        for (Component component : container.getComponents()) {
            if (component instanceof Container) {
                Component child = getComponentByName((Container) component, name);
                if (child != null) {
                    return child;
                }
            }
            if (component instanceof AbstractButton) {
                AbstractButton button = (AbstractButton) component;
                if (name.equals(button.getText())) {
                    return button;
                }
            }
        }
        return null;
    }



}



