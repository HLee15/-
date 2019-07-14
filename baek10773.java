/*
0�� �Է¹����� pop
0�� �ƴ� ������ stack�� push�Ѵ�.
�Է��� ������ stack�� �����ϴ� ��� ������ ���� ���Ͽ� ����Ѵ�.
*/
import java.util.Scanner;

public class baek10773 {
	static int index = -1;
	static int[] stack = new int[100000];
	static int sum=0;
	public static void pop() {
		sum-=stack[index];
		index--;
	}

	public static void push(int n) {
		index++;
		stack[index] = n;
		sum+=stack[index];
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int k = kb.nextInt();
		int n;
		for (int i = 0; i < k; i++) {
			n = kb.nextInt();
			if (n == 0)
				pop();
			else
				push(n);
		}


		System.out.printf("%d", sum);
	}

}
