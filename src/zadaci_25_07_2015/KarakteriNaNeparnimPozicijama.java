package zadaci_25_07_2015;

import java.util.Scanner;

public class KarakteriNaNeparnimPozicijama {
//cetvrti zadatak
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Unesite string cije neparne karaktere zelite:");		
		String line=input.nextLine();											//korisnik unosi string
		input.close();															//zatvaramo scanner
		for(int i=0; i<line.length(); i++){							
			if(i%2==0)															//petljom prolazimo kroz string, indexi pocinju od 0, tako da se
				System.out.print(line.charAt(i));								//karakteri na parnim indexima, nalaze na neparnim pozicijama
		}
	}

}
