/*
 * �Է¹��� ���ڿ��� "-"�� �������� ������ 
 * ù���ڷθ� ������ �޸� ����ÿ�
 * */

import java.util.Scanner;

public class memo {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		String str = kb.nextLine();
		String[] token = str.split("-");
		String memo = "";

		for (int i = 0; i < token.length; i++) {
			memo += token[i].substring(0,1);
		}
	
		// ��� ���
		System.out.println();
		System.out.printf("%s", memo);
	}

}
