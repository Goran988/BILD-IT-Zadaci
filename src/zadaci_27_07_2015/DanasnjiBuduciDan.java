package zadaci_27_07_2015;

import java.util.Scanner;

public class DanasnjiBuduciDan {
//prvi zadatak
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Unesite danasnji dan(0 - pon, 1 - uto...) i broj dana nakon danasnjeg:");
		int danasnjiDan=input.nextInt();						//korisnik unosi pocetni dan
		int brojDana=input.nextInt();							//korisnik unosi broj dana koji trebaju proci
		int buduciDan=(danasnjiDan+brojDana)%7;					//buduci dan je ostatak djeljenja danasnjeg dana i broja dana sa brojem 7
		String dan="";
		switch (buduciDan) {									//switch-em dodjeljujemo vrijednost stringu dan ovisno o buducemDanu
			case 0: dan="Ponedeljak";
			break;
			case 1: dan="Utorak";
			break;
			case 2: dan="Srijeda";
			break;
			case 3: dan="Cetvrtak";
			break;
			case 4: dan="Petak";
			break;
			case 5: dan="Subota";
			break;
			case 6: dan="Nedelja";
			break;
		}
		System.out.println("Buduci dan je: "+ dan);				//ispisujemo rezultat
	}

}
