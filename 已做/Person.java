package programee1;
import java.util.Scanner;
import programee.Person;
public class TestMain {
   public static void main(String[] args) {
	   Scanner input=new Scanner(System.in);
	   System.out.println("请输入姓名:");
	   String i_n=input.next();
	   
	   System.out.println("请输入年龄:");
	   int i_a=input.nextInt();
	   
	   System.out.println("请输入性别:");
	   String i_g=input.next();
	   
	   System.out.println("请输入身高:");
	   float i_h=input.nextFloat();
	   
	   Person s=new Person(i_g, i_a, i_g, i_h);
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getGender());
		System.out.println(s.getHeight());
		if(s.canMarry()){
			System.out.println("可以结婚!");
		}
		else{
			System.out.println("不可以结婚!");	
		}
	}
}


package programee;
public class Person {
	private String name;
	private int age;
	private String gender;
	private float height;

	public Person(String name,int age,String gender, float height){    //构造函数
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.height=height;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public float getHeight() {
		return height;
	}

	public int getAge() {
		return age;
	}
	public boolean canMarry() {
		if((gender.equals("男") && age>=22)||(gender.equals("女") && age>=20)){
			return true;	
		}
		else{
			return false;
		}
	}
}