package SpaceInvaders;


import java.io.IOException;

import javax.swing.JFrame;

public class SpaceInvaders extends JFrame implements Commons {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SpaceInvaders() throws IOException
    {
        add(new Board());
        setTitle("Space Invaders");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(BOARD_WIDTH, BOARD_HEIGTH);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args) throws IOException {
        new SpaceInvaders();
    }
}