package szamologep;

import java.util.Scanner;

class SzamoloGepTeszt {

	public static void main(String[] args) {
		
		Kiir kiir = new Kiir();
		Kivon kivon = new Kivon();
		Osszead osszead = new Osszead();
		Oszt oszt = new Oszt();
		Szoroz szoroz = new Szoroz();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a. feladat: ");
		int num1 = 9;
		int num2 = 3;
		int num3 = 4;
		kiir.kiir(osszead.osszead(szoroz.szoroz(num1, num2), num3));
		
		System.out.println("b. feladat: ");
		int num4 = 11;
		int num5 = 5;
		int num6 = 1;
		kiir.kiir(kivon.kivon(oszt.oszt(num4, num5), num6));
		
		System.out.println("c. feladat: ");
		int num7 = 2;
		kiir.kiir(oszt.oszt(kivon.kivon(szoroz.szoroz(osszead.osszead(num7, num5), num2), num4), num3));
	}

}
