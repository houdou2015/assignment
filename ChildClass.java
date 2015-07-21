class BaseClass {
	private double length;
	private double width;
	private String color;

	public BaseClass (){

	}
	public BaseClass (double length){
		this.length=length;
		this.width=length;  
	} 

	public BaseClass (double length,String color){
		this.length=length;
		this.width=length;
		this.color=color;
	}  

	public BaseClass(double length,double width,String color){
		this.length=length;
		this.width=width; 
		this.color=color;
	}
	public double getArea(){
		return length*width; 
	} 

	public void printInfo(){
		System.out.println("长为："+length+"宽为："+width+"颜色为："+color+"面积为："+getArea());

	}

}
class Square extends BaseClass{
	public Square(double length, String color) {
		super(length, color);
	}
}
public class ChildClass {
	public static   void main(String[] args){
		double length=20;
		String color=null;
		Square s = new Square(length, "black");
		s.printInfo();

	}
}
