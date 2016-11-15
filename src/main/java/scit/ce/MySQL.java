package scit.ce;

public class MySQL implements Database {

	public void connectDatabase(String connString) {
		System.out.println("connect Mysql " + connString);

	}

	public void disconnectDatabase() {
		System.out.println("disconnect Mysql");

	}

}
