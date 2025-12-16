package myClasses;

import java.util.Date;

public class ClassDriver {
	public static void main(String[] args) {
		System.out.println("Start - Driver.main:");
		Log log = new Log();
		System.out.println(log);
		Log.print("Start -- Log.print");
	}

	public static void startLog() {
		Date date = new Date();
		LogPublic log = new LogPublic(date);
		System.out.println("Start Log:" + date);
		log.print("Start -- LogPublic.print");
	}

}
