package circle;
import java.util.*;
public class c {
	public static double getArea(double r){
	     return 	Math.PI*r*r;
	    	 }
	public static void main(String[] args) {
		
		Scanner sanner=new Scanner(System.in);           //�����������s������ʼ��	
		double i=sanner.nextDouble();                     //������ı���s��ֵ��������i
	    System.out.println("circle1 Area is:"+getArea(i));
	    
		}
	
	}