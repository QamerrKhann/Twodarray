package odarrayproject;

import java.util.Scanner;

public class Main {
	
	
	public static int GameMinutes(int[][] arr, int student, int beginday, int endday)
	{
		int total = 0;
		
		for(int i = beginday; i <=endday; i++)
			total += arr[i][student];
					
		return total;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{30,45,0,30,20,30}, //Monday
				{30,45,0,30,20,30}, //Tuesday
				{30,0,30,0,50,45}, //Wednesday 
				{30,45,45,15,45,60}, //Thursday
				{60,0,45,60,15,60},//Friday
				{120,60,240,0,120,180},//Saturday
				{120,60,240,0,0,180}//Sunday
				};
		
		Scanner input = new Scanner(System.in);
		int stId, db, de;
		
		System.out.println("Enter the student id[0..5]");
		stId = input.nextInt();
		System.out.println("Enter the first and last days of the range");
		System.out.println("Monday:1, Tuesday:2...");
		db = input.nextInt();
		de = input.nextInt();
		
		int totalMinutes;
		totalMinutes = GameMinutes(arr,stId,db,de);
		//SOP total minutes
		


			}
	}

