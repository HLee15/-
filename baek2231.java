import java.util.Scanner;

public class baek2231 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String s; // ���ڿ��� ��ȯ
		String[] st;
		int tmp, k;

		for (int i = 1; i <= n; i++) {
			s = String.valueOf(i); // ���ڿ��� ��ȯ
			st = s.split(""); // �Ѵܾ�� �ɰ���
			k = tmp = i;

			for (int j = 0; j < s.length(); j++)
				tmp += Integer.parseInt(st[j]);

			// �������� ����

			// �����հ� n���� ���ٸ�
			if (tmp == n) {
				System.out.println(k);
				System.exit(0);
			}

		}
		System.out.println(0);

	}

}
