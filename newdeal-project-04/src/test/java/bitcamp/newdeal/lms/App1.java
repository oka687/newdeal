
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
			System.out.println("��ȣ");
			no[i] = len;
			System.out.println(no[i]);

			System.out.println("���� ����");
			title[i] = keyIn.nextLine();

			System.out.println("���� ����");
			content[i] = keyIn.nextLine();

			System.out.println("���� ������");
			startDate[i] = Date.valueOf(keyIn.nextLine());

			System.out.println("���� ������");
			endDate[i] = Date.valueOf(keyIn.nextLine());

			System.out.println("�� �ð�");
			totalHours[i] = Integer.parseInt(keyIn.nextLine());


			len++;
			System.out.println("����Ͻðڽ��ϱ�? y/n(���ʹ� y)");
			String select = keyIn.nextLine();
			if(select.equals("y") || select.equals("")) {
				continue;

			}
			break;

		}
		keyIn.close();

		for (int i = 0; i < len; i++) {
			System.out.printf("��ȣ %d, �������� %s, ���ǱⰣ %s ~ %s, �� �ð� %d\n",
					no[i], title[i], startDate[i], endDate[i], totalHours[i]);
		}
	}
}
