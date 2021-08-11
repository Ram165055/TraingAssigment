package com.techment.interfacedemo;
interface JdbcConnection{
	void connection();
}
class Oracle implements JdbcConnection{

	@Override
	public void connection() {
		// TODO Auto-generated method stub
		System.out.println("Oracle");
	}
	
}
class MySql implements JdbcConnection{

	@Override
	public void connection() {
		// TODO Auto-generated method stub
		System.out.println("Mysql");
	}
	
}

public class Main {

	public static void main(String[] args) {
		JdbcConnection jdbcConnection=new Oracle();
		jdbcConnection.connection();
	}

}
