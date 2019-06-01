import java.util.Scanner;
public class store {
	public static int[] coin= {1,5,10,50,100,500}; //���� 6��
	public static int[] dp= new int[10000]; //������ ����
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int c=kb.nextInt();
		int m=kb.nextInt();
		
		int charge=c-m;
	
		dp[0]=0;
		for(int i=1; i<=charge; i++) {
			dp[i]=10000; //ū���� ����
		}
		
		//���� ���� �ּҰ� ã��
		for(int i=0; i<coin.length; i++) {
			for(int j=coin[i]; j<=charge; j++) {
				dp[j]=Math.min(dp[j],dp[j-coin[i]]+1);
			}
		}
		
		System.out.printf("%d", dp[charge]);

	}

}
