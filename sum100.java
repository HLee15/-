
import java.util.*;
public class sum100 {
	public static final int SIZE =9;

	public static void main(String[] args) {
		Scanner kb= new Scanner(System.in);
		int[] array =new int[SIZE];
		int sum=0;
	
		System.out.println("1�̻� 100�̸��� 9�� ���� �Է�: ");
		for(int i=0; i<SIZE; i++) {
			array[i]=kb.nextInt();
			sum+=array[i];
		}
		
		int comp = sum-100;

		for(int i=0; i<SIZE-1; i++) {
			for(int j=i+1; j<SIZE; j++) {
				if((array[i]+array[j])==comp) {
					array[i]=-1;
					array[j]=-1;
					break;
				}
					
			}
		}
		

		System.out.println("\n***���� 100�� �Ǵ� 7���� ���� ���***");
		for(int i=0; i<SIZE; i++)
			if(array[i]!=-1)
				System.out.printf("%d ", array[i]);

	}

}
