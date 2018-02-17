package lotto;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto  {

	public static void main(String[] args) {

		
		int random = 0;
		int tmb [] = new int[90];
		Integer[] huzas = new Integer[100];
		Random rnd = new Random();
		Integer originalHuzas [] = new Integer[5]; 
		for(int i = 0; i < tmb.length; i++)
		{
			tmb[i] = i;
		}
	
		for(int i = 0; i < huzas.length; i++)
		{
			random = rnd.nextInt(90);
			while(random == 0)
				random = rnd.nextInt(90);
			huzas[i] = tmb[random];
		}
		
		Set <Integer> huzasIsmN = new HashSet<Integer>();
		while(huzasIsmN.size() < 6)
		{	
			random = rnd.nextInt(90);
			huzasIsmN.add(huzas[random]);
		}

		System.out.println(huzasIsmN);

	}
}

