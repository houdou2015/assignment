package programee1;
import java.util.Scanner;
import programee.Person;
public class TestMain {
   public static void main(String[] args) {
	   Scanner input=new Scanner(System.in);
	   System.out.println("����������:");
	   String i_n=input.next();
	   
	   System.out.println("����������:");
	   int i_a=input.nextInt();
	   
	   System.out.println("�������Ա�:");
	   String i_g=input.next();
	   
	   System.out.println("���������:");
	   float i_h=input.nextFloat();
	   
	   Person s=new Person(i_g, i_a, i_g, i_h);
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getGender());
		System.out.println(s.getHeight());
		if(s.canMarry()){
			System.out.println("���Խ��!");
		}
		else{
			System.out.println("�����Խ��!");	
		}
	}
}


package programee;
public class Person {
	private String name;
	private int age;
	private String gender;
	private float height;

	public Person(String name,int age,String gender, float height){    //���캯��
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
		if((gender.equals("��") && age>=22)||(gender.equals("Ů") && age>=20)){
			return true;	
		}
		else{
			return false;
		}
	}
}