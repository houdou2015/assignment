import java.util.*;
public class Average{                
	public static double averageScore(ArrayList<Integer> scores){
		double sum=0;
		int i=0;
		while(i<scores.size()){
			sum=sum+scores.get(i);
			i+=1;
		}
		return sum/(scores.size()-1);
		/*for(;i<scores.size();i++){
			sum+=scores.get(i);
		}
		return sum/(scores.size()-1);
        for(Integer x:scores){              scores��Ԫ������ΪInteger������         score��Ϊ��ʱִ��ѭ����
			sum+=x;
		}
		return sum/(scores.size()-1);
        do{sum=sum+scores.get(i);
		i++;
		}while(i<scores.size());
		return sum/(scores.size()-1);*/
	}
	public static void main(String[] args){
		Scanner san=new Scanner(System.in);
		double n=0;
		int i=0;
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> scores=new ArrayList<Integer>();
		System.out.print("Ҫ���ƽ��ֵ������-->");
		System.out.print("������ɼ�:");
		do{
			int mm=san.nextInt();
			i=mm;
			scores.add(mm);
		}while( i!=0);
		n=averageScore(scores);
		System.out.println(n);       
	}
}