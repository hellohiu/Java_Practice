package src.practice.practice;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarExam02 {
	public static void main(String[] args) {
		// 2023년 5월 달력 만들기
		//	   <2023년 5월>
		//일	월	화	수	목	금	토
		// 	1 	2	3	4	5	6
		//	7	8	9
		
		Scanner sc = new Scanner(System.in);
		GregorianCalendar gc = new GregorianCalendar();
		
		System.out.print("연도 : ");
		int y = sc.nextInt();
		sc.nextLine();
		
		System.out.print("월 : ");
		int m = sc.nextInt();
		sc.nextLine();
		
		// 한 달이 몇일까지 있는지 알 수 있다.
		Calendar cd = Calendar.getInstance();
		cd.set(Calendar.YEAR, y);
		cd.set(Calendar.MONTH, m-1);
		int n = cd.getActualMaximum(Calendar.DATE);

		// 1일부터 n(마지막)일까지 요일 저장
		int[] allDay = new int[n];
		for(int i=1; i<=n; i++) {
			gc.set(y, m-1, i);
			allDay[i-1] = gc.get(Calendar.DAY_OF_WEEK)-1;
		}
		
		System.out.println("<" + y + "년 " + m + "월>");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int cnt = 1;
		for(int i=1; i<=n; i++) {
			if(i == 1) {
				for(int j=0; j<allDay[i-1]; j++) {
					System.out.print("\t");
				}
			} 
			if(allDay[i-1] == 0 && i != 1) {
				System.out.println();
			}
			System.out.print(cnt++ + "\t");
		}
	}
}
