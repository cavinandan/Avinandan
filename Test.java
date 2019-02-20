package com.bp.swo.web;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login newLog= new Login();
		newLog.Login("https://flpnwc-a4500e0e7.dispatcher.hana.ondemand.com/sites/internalbp", "CFRGNUSR", "Password#00");
		
		LogOut logout=new LogOut();
		logout.logOutSWO();
		
	}

}
