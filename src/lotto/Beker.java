package lotto;

import java.util.Scanner;

public class Beker {

	private int tomb [] = new int[5];
	Scanner sc = new Scanner(System.in);
	
	public void beker()
	{
		int i = 0;
		System.out.println("Ajdon meg 5 számot egymás után: ");
		while(i < tomb.length )
		{
			tomb [i] = Integer.parseInt(sc.nextLine());
			i++;
		}
		
	}

	public int[] getTomb() {
		return tomb;
	}
	
}
