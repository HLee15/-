/*
 * OX ����
 * O�� ���������� ������ ���ʴ�� 1,2,3..���� ������
 * X �ڿ� O�� ������ ������ 1�� �ʱ�ȭ �ǰ� �� ���� O�� ���������� ������ 2,3...���� ��´�
 * */
import java.util.Scanner;

public class quiz {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str=kb.nextLine();
		int index=1, score=0;
		
		String[] s=str.split("");
		for(int i=0; i<s.length; i++) {
			if(s[i].equals("O")) {
				score+=index;
				index++;
			}
			else {
				index=1;
			}
		}
		System.out.printf("\n%d", score);

	}

}
