package m_2.cannonsimulator;

import java.awt.Color;

public class Ball {
    private double x;
    private double y;
    private double diameter;

    private double speedX;
    private double speedY;

    private double velocity;
    private Color color;

    public Ball(int x, int y, int diameter, int speedX, int speedY, Color color) {
        this.x = (double) x;
        this.y = (double) y;
        this.diameter = (double) diameter;
        this.speedX = (double) speedX / 4.5;
        this.speedY = (double) ((speedY / 4.5) * -1);
        this.color = color;

        this.velocity = this.speedY;
    }
}
