
/*
��� n���� �����Կ� Ű�� �־�����.
a�� k+1 ����麸�� ������ ���� Ű�� �۴ٸ� ��ŷ�� k+1�̴�.
n���� ��� ��� ���ϰ� ���� ��ŷ�� ����Ѵ�.
*/

import java.util.Scanner;

public class baek7568 {
	// ����� ������, Ű, ��ŷ
	public static class Person {
		public int weight;
		public int height;
		public int rank = 1;

		public Person(int weight, int height) {
			this.weight = weight;
			this.height = height;
		}

		// ��ŷ ����
		public void increaseRank() {
			rank++;
		}
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); // ����� ��
		int w, h;
		Person[] p = new Person[n]; // ��ü �迭 ����

		for (int i = 0; i < n; i++) {
			w = kb.nextInt(); // ������
			h = kb.nextInt(); // Ű
			p[i] = new Person(w, h); // ��ü ����
		}

		// ��
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// ���� �ͳ��� ���ϴ� �� ���ʿ�
				if (i == j)
					continue;

				// p[j]�� p[i]���� Ű�� ������ ���� ũ�ٸ� p[i]�� ��ŷ�� ������Ų��.
				if (p[i].weight < p[j].weight)
					if (p[i].height < p[j].height)
						p[i].increaseRank();
			}
		}
		// ������� ���
		for (int i = 0; i < n; i++)
			System.out.printf("%d ", p[i].rank);

	}

}
