import java.util.ArrayList;

abstract class Shape1{
	public abstract double area();
}
class Circle extends Shape1{                                 //��Բ�����
	private int r;
	public Circle(int r){
		this.r=r;
	}
	public double area() {
		return 3.14*r*r;
	}
}

class  triangle extends Shape1{                               //�������ε����           
	private double border;
	private double height;
	public  triangle(double border,double height){
		this.border=border;
		this.height=height;
	}
	public double area() {
		return (border*height)/2;
	}
}
class rec extends Shape1{                                    //�󳤷��ε����
	private double length;
	private double wide;
	public rec (double length,double wide){
		this.length=length;
		this.wide=wide;
	}
	public double area(){
		return length*wide;
	}
}

class Square extends Shape1{                                //�������ε����
	private double border;
	public Square(double border){
		this.border=border;
	}
	public double area() {
		return border*border;
	}
}

public class Shape {
	public static double  getTotalArea(ArrayList<Shape1> shapes){
		double totalArea=0;
		for(int i=0;i<shapes.size();i++){
			totalArea+=shapes.get(i).area();
		}
		return totalArea;
	}

	public static void main(String[] args){
		ArrayList<Shape1> shapes = new ArrayList<Shape1>();
		shapes.add(new Circle(15));
		shapes.add(new triangle(25,15));
		shapes.add(new rec(40,20));
		shapes.add(new Square(20));
		System.out.println("Total Area:" + getTotalArea(shapes));
	}

}
