import java.util.Scanner;

public class baek10809 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int[] alphabet = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1 };

		String str = kb.nextLine();
		str = str.toLowerCase(); // �ҹ��ڷ� ��ȯ
		char[] c = str.toCharArray(); // char �迭�� ��ȯ
		
		//����
		for(int i=0; i<c.length; i++) {
			if(alphabet[c[i]-97]!=-1)
				continue;
			alphabet[c[i]-97]=i;
		}
		//���
		for(int i=0; i<alphabet.length; i++) {
			System.out.printf("%d ",alphabet[i]);
		}

	}

}
