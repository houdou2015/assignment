package Programee3;
import java.util.Scanner;
import programee2.Student;
public class TestMain {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("请输入姓名:");
		String i_n=in.next();

		System.out.println("请输入年级:0--一年级--1--二年级--2--三年级--3--四年级");
		int i_g=in.nextInt();

		System.out.println("请输入专业:");
		String i_m=in.next();

		System.out.println("请输入四级成绩：");
		int[]  cet4_scores=new int[8];
		for(int j=0;j<8;j++){
			 cet4_scores[j]=in.nextInt();
			if(cet4_scores[j]>=425){
				System.out.println("恭喜你，通过了本次四级考试！");
	             break;}
			
			else {
				System.out.println("很遗憾，没通过！");
			}
		}

		Student s=new Student(i_n, i_g, i_m,cet4_scores );
		System.out.println(s.getName());
		System.out.println(s.getGrade());
		System.out.println(s.getMajor());

		s.printInfo();
		s.level_up();
		s.printInfo();

	}
	
}



package programee2;
import java.util.Scanner;

public class Student {
	private String name;
	private int grade;
	private String major;
	private int[]  cet4_scores;


	public Student(String name,int grade,String major, int[] cet4_scores ){                  //构造函数
		this.name=name;
		this.grade=grade;
		this.major=major;
		this.cet4_scores=cet4_scores;
	}

	

	public String getName() {
		return name;
	}

	public int getGrade() {
		
		return grade;
	}

	public String getMajor() {
		return major;
	}


	public int[] getCet4_scores() {
		
		return cet4_scores;
	}
	
	 public void level_up(){
		    this.grade++;	
		    System.out.println("恭喜你又升了一级");

		}
		

		public boolean passed_cet4(int[] cet4_scores) {
			boolean b=false;
			for(int k= 0;k<8;k++){
				if(cet4_scores[k]>=425){
				b=true;	
				break;
			    }
				
	         }
			return  b;	
    }
		
		public void printInfo(){

			System.out.println("姓名："+this.name+"  年级："+this.grade+"  专业："+
					this.major+"  是否过四级："+this.passed_cet4(cet4_scores));
		}	
		
}

