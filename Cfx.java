package Pro;

class Cfx1 {
	private double length;
	private double width;
	private String color;
	public Cfx1(){

	}


	public Cfx1(double i){
		this.length=i;
		this.width=i;  
	} 
	public Cfx1(double length,String color){
		this.length=length;
		this.width=length;
		this.color=color;
	}  
	public Cfx1(double length,double width,String color){
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
class Square extends Cfx1{
	public Square(double length, String color) {
		super(length, color);
	}
}
public class  Cfx{
	public static void main(String[] args){
		double length=20;
		String color=null;
		double width=20;
		System.out.println("长方形");
		Cfx1 cfx1=new Cfx1();
		cfx1.printInfo();
		Cfx1 cfx2=new Cfx1(length);
		cfx2.printInfo();
		Cfx1 cfx3=new Cfx1(length,"color");
		cfx3.printInfo();
		Cfx1 cfx4=new Cfx1(length,width,"color");
		cfx4.printInfo();
		System.out.println();
		Square ss=new Square(20,"color");
		ss.printInfo();

	}
}