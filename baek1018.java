/*
 * M*N�� ���尡 �־�����.
 8*8ũ���� ü�������� �߶� �Ŀ�, ���� �����ϴ� �� ���� �簢���� ���� ���� �ƴϵ��� W �Ǵ� B���� ��ĥ�ؾ� �Ѵ�.
 8*8ũ��� �ڸ� �ڿ� �ٽ� ĥ�ؾ��ϴ� ���簢�� ������ �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/
import java.util.Scanner;

public class baek1018 {

	static char[][] board;

	// ���ĺ� ����
	public static char change(char c) {
		if (c == 'B')
			return 'W';
		return 'B';
	}

	// BWBW...�� ������ �� ���ĺ� �����ؾ��ϴ� ����
	public static int start_BW(int i, int j) {
		int r = 0;
		char s = 'B', t=s;
		for (int a = j; a < j + 8; a++) {
			if (board[i][a] != t)
				r++;
			t = change(t);
		}
	
		for (int a = i + 1; a < i + 8; a++) {
			t=s=change(s);
			for (int b = j; b < j + 8; b++) {
				if (board[a][b] != t)
					r++;
				t = change(t);
			}
		}
		return r;
	}

	// WBWB...�� ������ �� ���ĺ� �����ؾ��ϴ� ����
	public static int start_WB(int i, int j) {
		int r = 0;
		char s = 'W', t=s;
		for (int a = j; a < j + 8; a++) {
			if (board[i][a] != t)
				r++;
			t = change(t);
		}
	
		for (int a = i + 1; a < i + 8; a++) {
			t=s=change(s);
			for (int b = j; b < j + 8; b++) {
				if (board[a][b] != t)
					r++;
				t = change(t);
			}
		}
		return r;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int m = kb.nextInt();
		int n = kb.nextInt();
		board = new char[m][n];
		String s;
		int res = 1000000, tmp = 0;

		for (int i = 0; i < m; i++) {
			s = kb.next();
			for (int j = 0; j < s.length(); j++)
				board[i][j] = s.charAt(j); // String->char�� ��ȯ
		}

		// 8*8
		for (int i = 0; i <= m - 8; i++) {
			for (int j = 0; j <= n - 8; j++) {
				tmp = Math.min(start_BW(i, j), start_WB(i, j));
				res = Math.min(res, tmp);
			}
		}

		// ���
		System.out.println(res);
	}

}
