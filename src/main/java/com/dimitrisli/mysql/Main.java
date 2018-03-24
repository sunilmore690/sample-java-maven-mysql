package com.dimitrisli.mysql;

public class Main {
	public static final String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
	public static final String MYSQL_URL = "jdbc:mysql://node7823-shrikant.mj.milesweb.cloud/javaTestDB?"
											+ "user=root&password=BKYdlf91816";
	
	public static void main(String[] args) throws Exception {
		MySQLJava dao = new MySQLJava(MYSQL_DRIVER,MYSQL_URL);
		dao.readData();
	}
}
