package zadaci_25_07_2015;

import java.util.Scanner;

public class BuducaVrijednostInvesticije {
//prvi zadatak
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out
				.println("Unesite iznos investicije, godisnju interesnu stopu i broj godina:");
		double iznosInvesticije = input.nextDouble();					//korisnik unosi vrijednost investicije
		double godisnjaInteresnaStopa = input.nextDouble();				//godisnju stopu
		double mjesecnaInteresnaStopa=(godisnjaInteresnaStopa/12)/100;	//pomocu godisnje stope racunamu mjesecnu interesnu stopu
		double brojGodina = input.nextInt();
		double buducaVrijednostInvesticije=iznosInvesticije*Math.pow((1+mjesecnaInteresnaStopa),(brojGodina*12));	//formula za racunanje buduce vrijednosti
		System.out.printf("%.2f",buducaVrijednostInvesticije);			//stampamo rezultat pri cemu zaokruzujemo na 2 decimale
//		buducaVrijednostInvesticije=(int)(buducaVrijednostInvesticije*100);			u slucaju da samo odbijamo "visak decimalnih mjesta bez matematickog 
//		buducaVrijednostInvesticije=buducaVrijednostInvesticije/100;				zaokruzivanja
//		System.out.println(buducaVrijednostInvesticije);
	}

}
