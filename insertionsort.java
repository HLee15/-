import java.util.Scanner;
public class insertionsort {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("�迭 ũ�� �Է�:");
		int n=kb.nextInt();
		int[] array=new int[n];
		int val,i,j;
		
		System.out.printf("���� %d�� �Է��ϼ���:",n);
		for(i=0; i<n; i++) {
			array[i]=kb.nextInt();
		}
		
		//insertion_sort
		for(i=1; i<n; i++) {
			j=i-1;
			val=array[i];
			while(j>=0 && val<array[j]) {
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=val;
			
		}
		
		System.out.println("**����**");
		for(i=0; i<n; i++) 
			System.out.printf("%d ",array[i]);
	}

}
