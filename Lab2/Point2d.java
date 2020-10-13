//Двумерный класс точки

public class Point2d{
	//Координата Х
	private double xCoord;
	//Координата Y
	private double yCoord;
	//Конструктор инициализации
	public Point2d(double x, double y){
		xCoord = x;
		yCoord = y;
	}
	//Конструктор по умолчанию
	public Point2d(){
		this(0,0);
	}
	//Возвращаем координаты X
	public double getX(){
		return xCoord;
	}
	//Возвращаем координаты Y
	public double getY(){
		return yCoord;
	}
	//Установка значения координаты X
	public void setX(double val){
		xCoord = val;
	}
	public void setY(double val){
		yCoord = val;
	}
}
