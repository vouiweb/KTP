import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class JImageDisplay extends JPanel {
	
	private int width;
	private int height;
	private BufferedImage img;
	private Graphics g;

	//Конструктор	
	public JImageDisplay(int width, int height) {
		img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		g = img.getGraphics();
		this.repaint();
	}
	//Рисование
	public void drawPixel(int x, int y, Color color) {
		g.setColor(color);
		g.fillRect(x, y, 1, 1);
		this.repaint();
	}
	
	//Реакция при рисовании
	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, 0, 0, null);
    }
	
	//Очистка
	public void clearImage() {
		g.setColor(Color.black);
		g.fillRect(0, 0, img.getWidth(), img.getHeight());
		this.repaint();
	}
}