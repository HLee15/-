import java.util.Scanner;
public class baek2748 {
	//n�� ������� Ŀ���� �Ǻ���ġ ���ڵ� Ŀ���� ������ 8Bũ�⸦ ���� long type���� ����� ���ڰ� �� ©����
	static long[] dp=new long[10000];
	
	public static long fibo(int n) {
		if(n==0)
			return dp[0]=0;
		if(n==1)
			return dp[1]=1;
		if(dp[n]!=0)
			return dp[n];
		return dp[n]=fibo(n-2)+fibo(n-1);
	}
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(fibo(n));
	}

}
