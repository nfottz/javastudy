package ex03_date_time;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Ex04_SimpleDateFormat {

	/*
	 	형식
	 	1. yy	: 23
	 	2. yyyy : 2023
	 	3. M	: 1 (1~12)
	 	4. MM	: 01 (01~12)
	 	5. MMM 	: 1월(local)
	 	6. d	: 17 (1~31)
	 	7. dd	: 17 (01~31)
	 	8. E	: 화(local)
	 	9. a	: 오후(local)
	 	10. h	: 2 (1~12)
	 	11. hh	: 02 (01~12)
	 	12. H	: 14 (0~23)
	 	13. HH	: 14 (00~23)
	 	14. m	: 8 (0~59)
	 	15. mm	: 08 (00~59)
	 	16. s	: 30 (0~59)
	 	17. ss	: 30 (00~59)
	 */
	
	public static void main(String[] args) {
		
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy. MM. dd. (E) a hh:mm:ss");
		String strNow = sdf.format(now);
		System.out.println(strNow);
		
	}

}
