package curso_programacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Dates {

	public static void main(String[] args) throws ParseException {

//		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
//		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
//		
//		Date y1 = sdf1.parse("11/06/2022");
//		Date y2 = sdf2.parse("11/06/2022 22:03:04");
//		Date x1 = new Date();
//		Date x2 = new Date(1000L * 60L * 60L * 5L);
//		
//		System.out.println("y1: " + sdf2.format(y1));
//		System.out.println("y2: " + y2);
//		System.out.println(x1);
//		System.out.println(x2);
//		System.out.println("y1: " + sdf3.format(y2));
		
		// Utilizando o Calendar
		
		// Somando unidade de tempo
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2022-06-18T22:12:00Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
//		cal.add(Calendar.HOUR_OF_DAY, 4);
//		d = cal.getTime();
		
//		System.out.println(sdf.format(d));
		
		// Obtendo unidade de tempo
		
		int minutes = cal.get(Calendar.MINUTE);
		
		System.out.println("Minutes: " + minutes);
		
		int month = 1 + cal.get(Calendar.MONTH);
		
		System.out.println("Month: " + month);
	}

}
