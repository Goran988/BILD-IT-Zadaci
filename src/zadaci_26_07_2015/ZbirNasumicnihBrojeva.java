package zadaci_26_07_2015;

import java.util.Scanner;

public class ZbirNasumicnihBrojeva {
//prvi zadatak
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = (int) (Math.random() * 100);					//generisemo nasumicne brojeve
		int b = (int) (Math.random() * 100);
		int c = (int) (Math.random() * 100);
		int result=a+b+c;										//rezultat zbira nasumicnih brojeva
		int user;
		do{
			System.out.println(a+"+"+b+"+"+c+"=");				//u petlji postavljamo pitanje, korisniku da unese zbir 3 nasumicna broja
			user=input.nextInt();
		}while(result!=user);									//petlja se izvrsava dok korisnik ne unese tacan odgovor
		System.out.println("Cestitamo unjeli ste tacan odgovor!");	//cestitamo korisniku na unesenom tacnom odgovoru

	}
}
