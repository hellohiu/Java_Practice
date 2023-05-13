package src.practice.practice;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarMission01 {
	public static void main(String[] args) {
		// 키보드 입사일을 입력 -> 몇년 몇개월 재직 중...
		// String pattern = "yyyy/MM/dd"; // => ex)2022/01/01
		GregorianCalendar gc = new GregorianCalendar();
		Scanner sc = new Scanner(System.in);
		System.out.print("입사일 : ");
		String day = sc.nextLine();
		
		// 입사일 저장 배열에 저장 (String 타입)
		String[] gcStr = day.split("/");

		// 현재 날짜와 입사일 비교
		int year = gc.get(Calendar.YEAR)-Integer.parseInt(gcStr[0]);
		int month = gc.get(Calendar.MONTH)+1-Integer.parseInt(gcStr[1]);
		while(month < 0) {
			year -= 1;
			month += 12;
		}
		// int date = gc.get(Calendar.DATE)-Integer.parseInt(gcStr[2]);
		
		System.out.println(year + "년 " + month + "개월 재직 중...");

	}
}
