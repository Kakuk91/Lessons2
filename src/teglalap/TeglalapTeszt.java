package teglalap;

public class TeglalapTeszt {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		
		int kerulet = 0;
		int terulet = 0;
		
		Beker be = new Beker();
		TeglaKer ker = new TeglaKer();
		TeglaTer ter = new TeglaTer();
		Kiir kiir = new Kiir();
		
		be.setaOldal(4);
		be.setbOldal(3);
		a = be.getaOldal();
		b = be.getbOldal();
		
		kerulet = ker.kerulet(a, b);
		terulet = ter.terulet(a, b);
		
		kiir.kiir("A téglalap kerület: " + kerulet + "\nA téglalap területe: " + terulet);
	}

}
