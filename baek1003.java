import java.util.Scanner;
/*�Ǻ���ġ �Լ��� ȣ��� �� 0�� 1�� ȣ��Ǵ� ������ ���
 * n�� ���ڰ� �־����� �� 0�� ȣ��Ǵ� ������ n-1�� 0�� ȣ��Ǵ� ����+ n-2�� 0�� ȣ��Ǵ� �����̴�. (1�� ��������)
 * ���� dp[n][0]=dp[n-1][0]+dp[n-2][0]�� �ȴ�.
 * */
public class baek1003 {
	static int[][] dp = new int[41][2];

	public static int fibo_0(int n) {
		if (n == 0)
			return dp[0][0] = 1;
		else if (n == 1)
			return dp[1][0] = 0;
		//�ߺ� ����� ����
		if (dp[n][0] != 0)
			return dp[n][0];
		return dp[n][0] = fibo_0(n - 1) + fibo_0(n - 2);
	}

	public static int fibo_1(int n) {
		if (n == 0)
			return dp[0][1] = 0;
		else if (n == 1)
			return dp[1][1] = 1;
		//�ߺ� ����� ����
		if (dp[n][1] != 0)
			return dp[n][1];
		return dp[n][1] = fibo_1(n - 1) + fibo_1(n - 2);
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt(); //test�� ����
		int n[] = new int[t];
		for (int i = 0; i < t; i++) {
			n[i] = kb.nextInt();
			fibo_0(n[i]);
			fibo_1(n[i]);
		}
		// print
		for (int i = 0; i < t; i++)
			System.out.printf("%d %d\n", dp[n[i]][0], dp[n[i]][1]);
	}

}
