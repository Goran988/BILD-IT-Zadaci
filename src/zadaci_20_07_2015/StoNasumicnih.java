package zadaci_20_07_2015;

public class StoNasumicnih {

	public static void main(String[] args) {
		//zadatak 4
		int[] nums=new int[10];								//pravimo niz od 10 integera od 0-9
		for(int i=0; i<100; i++){							//pravimo petlju koja ce odraditi 100 iteracija
			nums[(int)(Math.random()*10)]++;				//uvecavamo elemente niza na onim indeksima koji odgovaraju nasumicno generisanom broju
		}
		for(int i=0; i<nums.length; i++){					//stampamo koji broj se ponovio koliko puta
			System.out.println("Broj " + i+ " ponovio se " + nums[i]+" puta.");
		}

	}

}
