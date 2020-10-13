import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.event.*;

public class FractalExplorer {
	
	private int width;
	private int height;
	
	private JImageDisplay display;
	private Rectangle2D.Double range;
	private JFrame frame;
	private JButton resetbutton;
	private Mandelbrot mandelbrot;
	
	//Конструкторы
	public FractalExplorer() {
		this(800);
	}
	public FractalExplorer(int size) {
		this(size, size);
	}	
	public FractalExplorer(int width, int height) {
		this.width = width;
		this.height = height;
		this.range = new Rectangle2D.Double();
		this.mandelbrot = new Mandelbrot();
		mandelbrot.getInitialRange(range);	
	}
	
	//Создание графического интерфейса
	public void createAndShowGUI() {
		// Создание формы
		this.frame = new JFrame("Fractals");
		this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.frame.setSize(this.width, this.height);
		this.frame.setResizable(false); 
		
		// Добавление кнопки
		this.resetbutton = new JButton("Reset");
		frame.getContentPane().add(BorderLayout.SOUTH, this.resetbutton);
		resetbutton.addActionListener(new resetButtonListener());
		
		// Создание панели рисования
		this.display = new JImageDisplay(this.frame.getWidth(), this.frame.getHeight());
		frame.getContentPane().add(BorderLayout.CENTER, this.display);
		display.addMouseListener(new mouseClickListener());
		frame.setVisible(true);
	}
	//Отрисовка фрактала
	public void drawFractal() {
		for (int x = 0; x < this.width; x++) {
			for (int y = 0; y < this.height; y++) {
				double xCoord = FractalGenerator.getCoord(range.x, range.x + 
					range.width, display.getWidth(), x);
				double yCoord = FractalGenerator.getCoord(range.y, range.y + 
					range.height, display.getHeight(), y);

				int numiter = mandelbrot.numIterations(xCoord, yCoord);
				int rgbColor;
				if (numiter == -1) rgbColor = Color.HSBtoRGB(0, 0, 0); 
				else {
					float hue = 0.7f + (float) numiter / 200f; 
					rgbColor = Color.HSBtoRGB(hue, 1f, 1f); 
				}
				display.drawPixel(x, y, new Color(rgbColor));
			}
		}
	}
	//Классы событий кнопки и мыши
	private class resetButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			mandelbrot.getInitialRange(range);
			FractalExplorer.this.drawFractal();
		}
	}
	
	private class mouseClickListener implements MouseListener {
		@Override
		public void mouseClicked(MouseEvent e) {
			int x = e.getX();
			double xCoord = FractalGenerator.getCoord(range.x, range.x + 
				range.width, display.getWidth(), x);
			int y = e.getY();
			double yCoord = FractalGenerator.getCoord(range.y, range.y + 
				range.height, display.getHeight(), y);
			//ЛКП
			if (e.getButton() == MouseEvent.BUTTON1) {
				mandelbrot.recenterAndZoomRange(range, xCoord, yCoord, 0.5);
			}
			
			//ПКМ
			if (e.getButton() == MouseEvent.BUTTON3) {
				mandelbrot.recenterAndZoomRange(range, xCoord, yCoord, 1.5);
			}
			FractalExplorer.this.drawFractal();	
		}
		
		/*
		* Need just to override them (error with russian words here)
		*/
		public void mouseEntered(MouseEvent e) {}
 
        public void mouseExited(MouseEvent e) {}
 
        public void mousePressed(MouseEvent e) {}
 
        public void mouseReleased(MouseEvent e) {}
	}
	//Точка входа
	public static void main(String[] args) {
		FractalExplorer dispExplorer = new FractalExplorer(800);
		dispExplorer.createAndShowGUI();
		dispExplorer.drawFractal();
	}
}