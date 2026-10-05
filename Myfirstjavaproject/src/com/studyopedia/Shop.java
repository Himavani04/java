package com.studyopedia;

public class Shop {
	static int chocolatescost=15;
	static int cookiecost=10;

	int Totalcost=450;
	int chocolatesbought=10*15;
	int cookiebought =5*10;
	int remainingamount=(Totalcost-(chocolatesbought+cookiebought));
public static void main(String args[]) {
	Shop s=new Shop();
	System.out.println("Remaining amount is:"+s.remainingamount);
	}

}
