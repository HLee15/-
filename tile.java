//n*m�� Ÿ�� �׵θ��� p*1Ÿ�Ϸ� ���� �� ������ p���� ��� ���

import java.util.Scanner;

public class tile {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int i, left, max_p,p=1;;
		int n = kb.nextInt(); // ����
		int m = kb.nextInt(); // ����

		//���� ���ΰ� ���κ��� ��ٸ� �ٲ���
		if(m>n){
			int temp=n;
			n=m;
			m=temp;
		}
		max_p=m-2;
		
		while (p<=max_p) {
			// ���� ��->��
			i = n % p;
			if (i == 0)
				left = 1;
			else if (i == 1)
				left = 0;
			else {
				p++;
				continue;
			}

			// ���� ��->�Ʒ�
			i = (m - left) % p;
			if (i == 0)
				left = 1;
			else if (i == 1)
				left = 0;
			else {
				p++;
				continue;
			}
			// ���� ��->��
			i = (n-left) % p;
			if (i == 0)
				left = 1;
			else if (i == 1)
				left = 0;
			else {
				p++;
				continue;
			}

			// ���� �Ʒ�->��
			i = (m - left - 1) % p;
			if (i == 0)
				System.out.printf("%d ", p);

			p++;

		} // end of while

	}

}
