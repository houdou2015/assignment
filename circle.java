package circle;
import java.util.*;
public class c {
	public static double getArea(double r){
	     return 	Math.PI*r*r;
	    	 }
	public static void main(String[] args) {
		
		Scanner sanner=new Scanner(System.in);           //声明输入变量s，并初始化	
		double i=sanner.nextDouble();                     //将输入的变量s的值赋给整数i
	    System.out.println("circle1 Area is:"+getArea(i));
	    
		}
	
	}