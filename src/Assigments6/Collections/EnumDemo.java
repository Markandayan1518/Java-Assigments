package Assigments6.Collections;

enum Season {
	WINTER, SPRING, SUMMER,MONSOON
}

public class EnumDemo {
	
	public static void main(String[] args) {

		Season currentSeason = Season.MONSOON;
		switch (currentSeason) {
		case WINTER:
			System.out.println("It's Winter");
			break;
		case SPRING:
			System.out.println("It's Spring");
			break;
		case SUMMER:
			System.out.println("It's Summer");
			break;
		case MONSOON:
			System.out.println("It's Monsoon");
		default:
			break;		
		
		}		
		System.out.println("Different season in a year are: ");
		
		
		for (Season s : Season.values()) {
			System.out.println(s);
		}		
		
	}
}
