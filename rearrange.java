
import java.util.Arrays;
import java.util.Scanner;

public class rearrange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("���ڿ� �� ���� �Է��ϼ���.");
		String s1 = kb.next();
		String s2 = kb.next();

		// ��� �ҹ��ڷ� ��ȯ
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		String[] as1 = s1.split("");
		String[] as2 = s2.split("");

		// �迭�� ������������ ����
		// [����] �������� : Arrays.sort(�迭,Collections.reverseOrder())

		Arrays.sort(as1);
		Arrays.sort(as2);

		// �迭�� ���ڿ��� ��ȯ
		s1=Arrays.toString(as1);
		s2=Arrays.toString(as2);


		if (s1.equals(s2))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
