import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Leap_year {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("������ ���� ������ �Է��Ͻÿ� : ");
		int year=Integer.parseInt(br.readLine());
		
		boolean isLeapYear=false;
		
		if(year%4==0 && (year%100!=0 ||year%400==0 ))
			isLeapYear=true;
		
		if(isLeapYear)
			System.out.printf("%d���� �����Դϴ�.",year);
		else
			System.out.printf("%d���� ������ �ƴմϴ�.",year);
		
		br.close();
	}

}
