import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;
import java.util.HashSet;

public class ����������_1443 {
	static long max = 1;
	static int d, p;

	public static void bfs() {
		Queue<Long> q = new LinkedList<Long>();
		q.add((long) 1); 
		int n = 0; // ��� Ƚ��
		while (!q.isEmpty()) {
			int size = q.size();
			//HashSet���� n��° �������� �� ������ ������ ������
			// 2*4,4*2 �Ǵ� 4*4 �Ǵ� 2*8�� ���� ���� ���� ����Ǵ� ���� �����ϱ� ����
			HashSet<Long> h = new HashSet<Long>();
			for (int i = 0; i < size; i++) {
				long v = q.poll();
				//p��ŭ ������ �Ͽ��ٸ� MAX�� ���� ����
				if (n == p) {
					max = Math.max(v, max);
					continue;
				}
				for (int j = 9; j >= 2; j--) {
					long value = v * j;
					//���Ⱑ ��Ÿ�� �� �ִ� ���̺��� ��ų� �̹� ����� ���̸� Continue
					if ((long) (Math.log10(value) + 1) > d || h.contains(value))
						continue;
					h.add(value);
					q.add(value);
				}
			}
			n++;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		d = Integer.parseInt(st.nextToken());
		p = Integer.parseInt(st.nextToken());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//D�� P���� ũ�ų� ���ٸ� ������� Math.pow(9,p)�̴�
		if (d >= p) {
			for (int i = 1; i <= p; i++)
				max *= 9;
		} 
		// D���� P�� ū ��� bfs()�Լ��� ȣ���Ͽ� �ִ��� ���Ѵ�.
		else {
			bfs();
			max = max == 1 ? -1 : max;
		}
		bw.write(max + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

}
