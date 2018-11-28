
package bitcamp.newdeal.lms;

import java.sql.Date;

import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {


		final int DEFAULT_SIZE = 20;

		int[] no = new int[DEFAULT_SIZE];
		String[] title = new String [DEFAULT_SIZE];
		String[] content = new String [DEFAULT_SIZE];
		Date[] startDate = new Date[DEFAULT_SIZE];
		Date[] endDate = new Date[DEFAULT_SIZE];
		int[] totalHours = new int[DEFAULT_SIZE];

		Scanner keyIn = new Scanner(System.in);

		int len = 0;

		for(int i = 0; i < DEFAULT_SIZE; i++) {
			System.out.println("번호");
			no[i] = len;
			System.out.println(no[i]);

			System.out.println("강의 제목");
			title[i] = keyIn.nextLine();

			System.out.println("강의 내용");
			content[i] = keyIn.nextLine();

			System.out.println("강의 시작일");
			startDate[i] = Date.valueOf(keyIn.nextLine());

			System.out.println("강의 종료일");
			endDate[i] = Date.valueOf(keyIn.nextLine());

			System.out.println("총 시간");
			totalHours[i] = Integer.parseInt(keyIn.nextLine());


			len++;
			System.out.println("계속하시겠습니까? y/n(엔터는 y)");
			String select = keyIn.nextLine();
			if(select.equals("y") || select.equals("")) {
				continue;

			}
			break;

		}
		keyIn.close();

		for (int i = 0; i < len; i++) {
			System.out.printf("번호 %d, 강의제목 %s, 강의기간 %s ~ %s, 총 시간 %d\n",
					no[i], title[i], startDate[i], endDate[i], totalHours[i]);
		}
	}
}
