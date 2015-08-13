package zadaci_12_08_2015;

public class TimeTest {

	public static void main(String[] args) {
		//object created with default constructor that uses current time
		Time t1=new Time();
		System.out.println(t1.hour+":"+t1.minute+":"+t1.second);
		//object that uses elapsed time entered by the user
		Time t2=new Time(555550000);
		System.out.println(t2.hour+":"+t2.minute+":"+t2.second);
		

	}

}
