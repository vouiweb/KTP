public class Point3d{
	//Координаты X,Y,Z
	private double xCoord;
	private double yCoord;
	private double zCoord;
	//Конструктор по умолчанию
	public Point3d(){
		this(0,0,0);
	}
	//Конструктор инициализации
	public Point3d(double x, double y, double z){
		xCoord = x;
		yCoord = y;
		zCoord = z;
	}
	//Установка значений координат
	public void setX(double val){
		xCoord = val;
	}
	public void setY(double val){
		yCoord = val;
	}
	public void setZ(double val){
		zCoord = val;
	}
	//Возврат координат
	public double getX(){
		return xCoord;
	}
	public double getY(){
		return yCoord;
	}
	public double getZ(){
		return zCoord;
	}
	public double distanceTo(Point3d other){
		return Math.abs(Math.sqrt(Math.pow(getX()-other.getX(), 2) 
			+ Math.pow(getY()-other.getY(), 2) 
			+ Math.pow(zCoord-other.getZ(), 2)));
	}
}