package fr.dawan.projet1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
	private static Logger myLogger = LogManager.getLogger(App.class.getName());

	private static Logger myLoggerError = LogManager.getLogger("myLogger2");

	public static void main(String[] args) {

		myLogger.info("My first log");
		myLogger.warn("My first warning");
		myLoggerError.error(new NullPointerException("null example"));

		System.out.println("Révision objet");

	}
//_________________________

}
