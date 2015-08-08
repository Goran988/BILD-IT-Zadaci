package zadaci_07_08_2015;

public class RandomNumberChoser {
	/**
	 * Write a method that returns random number between 1 and 54, but excluding
	 * numbers user passed to the method.
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(getRandom(3,4,5,6,7,8,9,10));				//printing out the result of method, we pass some integers that can't be result

	}
	public static int getRandom(int... numbers){
		boolean usersNumber=false;
		int num=0;
		while(!usersNumber){											//loop that goes until we get random number different from the one we passed to the method
			usersNumber=true;											//num is random number 1-54
			num=(int)(Math.random()*54+1);
			for(int e:numbers){											//enhanced for loop that goes through numbers user passed to us
				if(num==e){
					usersNumber=false;									//if our random number matches any of users numbers we break the loop and random new number
					break;
				}
			}
		}
		return num;
	}

}
