
import java.util.*;

public class traMatrix {
	/*
	 * ��ġ ��� �����
	 */

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("���� ũ�⸦ �Է��ϼ���: ");
		int row = kb.nextInt();
		System.out.println("���� ũ�⸦ �Է��ϼ���: ");
		int col = kb.nextInt();
		int temp;
		int[][] a = new int[row][col];
		int[][] at = new int[row][col];

		// �Է�
		System.out.println("���ʴ�� ���Ұ��� �Է��ϼ���");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = kb.nextInt();
			}
		}
		System.out.println("\n*************���*************\n");
		// ��ġ��� ���~
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				at[i][j] = a[j][i];
				System.out.printf("%d ", at[i][j]);
			}
			System.out.println();
		}

	}

}
