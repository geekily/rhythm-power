package rhythm_power;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class Rhythm_Time extends Thread {

	@Override
	public void run() {

		try {

			System.out.println(time());

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static String time() {

		long systemTime = System.currentTimeMillis();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.KOREA);
		String time = formatter.format(systemTime);

		return time;

	}

	

}
