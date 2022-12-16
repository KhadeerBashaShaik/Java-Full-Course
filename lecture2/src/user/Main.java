package user;

import lecture2.SingletonClass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonClass s1,s2;
		s1=SingletonClass.getObject();
		s2=SingletonClass.getObject();
		s1.setXY(100, 200);
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
