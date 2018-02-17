package lotto;

import java.util.Random;

public class LottoHuz {

	private int tmb [] = new int[90];
	private int huzas [] = new int[5];
	Random rnd = new Random();

	public void huz()
	{
		int random = 0;
		for(int i = 1; i < tmb.length; i++)
		{
			tmb[i] = i;
		}
		for(int i = 0; i < huzas.length; i++)
		{
			random = rnd.nextInt(90);
			huzas[i] = tmb[random];
		}
		for(int i = 0; i < huzas.length; i++)
		{
			for(int j = 1; j < huzas.length - 1; j++)
			{
				if(huzas[i] == huzas[j])
					huzas[i] = tmb[random];
			}
		
		}
	}

	


}
