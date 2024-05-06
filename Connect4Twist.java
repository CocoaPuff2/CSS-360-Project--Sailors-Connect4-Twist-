import javax.swing.*;

public class Connect4Twist extends JFrame {

    // Game board dimensions
    private static final int ROWS = 6;
    private static final int COLS = 7;


    // to create the "frame for the game," taken from Medium.com
    public void startUpGame() {
        // setting up GUI window
        JFrame frame = new JFrame("ConnectF : (Local : Human vs Human)");
        setTitle("Connect4Twist");
        frame.setSize(618,612);
        initializeGUI();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize the game board
        int[][] board = new int[ROWS][COLS];

    }

    private void initializeGUI() {
        JPanel gamePanel = new JPanel();
        //gamePanel.setLayout(new GridLayout(ROWS, COLS));
    }
}

