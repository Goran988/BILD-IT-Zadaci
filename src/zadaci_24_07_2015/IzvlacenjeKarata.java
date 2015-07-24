package zadaci_24_07_2015;

public class IzvlacenjeKarata {

	public static void main(String[] args) {
		String[] karte = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10",		//niz koji sadrzi sve karte
				"J", "Q", "K" };
		String[] karteZnak={"Srca","Pika","Djeteline","Kocke"};						//niz koji sadrzi sve znakove
		System.out.println("Izvucena karta je "+ karte[(int)(Math.random()*13)]+ " u znaku " + karteZnak[(int)(Math.random()*4)]);
		//printamo izvucene karte, izvlacenje simuliramo metodom Math.random kojoj ogranicavamo rason brojem indexa u nizovima
	}

}
