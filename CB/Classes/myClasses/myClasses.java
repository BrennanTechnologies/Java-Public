// Package: myClasses
package myClasses;

import java.util.*;


///////////////////////////////
// Class: myClasses.myClasses
///////////////////////////////
class Driver {											// <-- run something 
	public static void main(String[] args) {
		//System.out.println("Start Driver:");
		// Log Log = new Log();
		//Log.print("Hello World - Start ");
	}
}

class LogPublic {										// <-- Write to Console and File
	public void print(String s) {
		System.out.println(s);
	}
}

class LogDefault {										// <-- Write to Console and File
	void print(String s) {
		System.out.println(s);
	}
}

class Log {												// <-- Write to Console and File
	Date date;

	Log () {
		date = new Date();
	}

	static void print(Date d, String s) {
		System.out.println(d + " : " + s);
		// Out File
	}
}
