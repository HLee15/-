import java.util.Scanner;

public class back1157 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int[] alphabet = new int[26];

		String str = kb.nextLine();
		str = str.toLowerCase(); // �ҹ��ڷ� ��ȯ
		char[] c = str.toCharArray(); // char �迭�� ��ȯ

		for (int i = 0; i < c.length; i++) {
			alphabet[c[i] - 97]++;
		}

		int max =alphabet[0];
		int index = 0;
		int max2 = 0;

		for (int i = 1; i < alphabet.length; i++) {
			if(alphabet[i]==0)
				continue;
			if (max < alphabet[i]) {
				index = i;
				max = alphabet[i];
			} else if (max == alphabet[i]) {
				max2 = alphabet[i];
			}
		}

		if (max == max2)
			System.out.println("?");
		else
			System.out.printf("%c", index + 65); // �빮�ڷ� ���
	}

}
