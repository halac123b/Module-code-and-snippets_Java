package m_2.cannonsimulator;

import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
    public static int WIDTH = 1200;
    public static int HEIGHT = 800;

    public GamePanel() {
        super();
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setFocusable(true);
        requestFocus();
        addMouseMotionListener(this);
        addMouseListener(this);

    }
}
