import java.util.Scanner;

public class baek1149 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] rgb = new int[n][3];
		int[][] dp = new int[n][n];
		
		for (int i = 0; i < n; i++) 
			for (int j = 0; j < 3; j++)
			rgb[i][j] = kb.nextInt();
		
		for (int i = 0; i <n; i++) {
			for (int j = 0; j < 3; j++) {
				//ù��° ���̸� dp�� �� rgb���� �����Ѵ�.
				if (i == 0)
					dp[i][j] = rgb[i][j];
				else {
					/*���� j=a�̸� ������ a�� �ƴ� ������ �������� �Ǿ��־���Ѵ�. 
					 * dp[i][0]=rgb[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
					 * dp[i][1]=rgb[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]);
					 * dp[i][2]=rgb[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]);
					 * */
					if (j == 0)
						dp[i][j] = rgb[i][j] + Math.min(dp[i - 1][1], dp[i - 1][2]);
					else if (j == 1)
						dp[i][j] = rgb[i][j] + Math.min(dp[i - 1][0], dp[i - 1][2]);
					else
						dp[i][j] = rgb[i][j] + Math.min(dp[i - 1][0], dp[i - 1][1]);
				}

			} // j
		} // i

		//������ dp�� �߿� �ּڰ��� ����Ѵ�.
		System.out.println(Math.min(dp[n-1][0], Math.min(dp[n-1][1], dp[n-1][2])));
	}

}
