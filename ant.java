import java.util.Scanner;
public class ant {

	public static int[] check(int[][] array, int num) {
		//����ڴ� 1�� ��ġ�� �ִٴ� ����
		int i,j;
		int[] ans =new int[2];
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				if(num==array[i][j]) {
					ans[0]=j+1; //���� ĭ��
					ans[1]=5-i; //���� ĭ��
					return ans; 
				}
			}
		}
		return ans; //������ 0
	}
	public static void main(String[] args) {
		Scanner kb =new Scanner(System.in);
		int a;
		int[][] chess = {{25,24,23,22,21},
						{10,11,12,13,20},
						{9,8,7,14,19},
						{2,3,6,15,18},
						{1,4,5,16,17}};
		
		System.out.println("�Է� ���� ����");
		int k =kb.nextInt();
		int[][] res=new int[k][2]; //����,���� ĭ�� ����� �迭
		
		System.out.printf("ü�� ��ȣ %d�� �Է��ϼ���\n",k);
		for(int i=0; i<k; i++) {
			a=kb.nextInt(); //ü���� ��ȣ �Է�
			res[i]=check(chess,a); // ü���� ��ȣ�� �����ϱ� ���� ����, ���� ĭ��
			
		}

		//���
		System.out.println("\n***���***");
		for(int i=0; i<k; i++) 
			System.out.printf("%d %d \n", res[i][0],res[i][1]);
		
	}

}
