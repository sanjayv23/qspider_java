package methods;

import java.util.Scanner;

public class Dec30 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter the basic Salary: ");
		int basicsal=scan.nextInt();
		System.out.print("Enter the year of join: ");
		int year=scan.nextInt();
		System.out.println("Your Total salary: "+salary_calc(basicsal, year));
		
		System.out.print("Enter the amount: ");
		int amt=scan.nextInt();
		System.out.println("No of current: "+no_of_currencynotes(amt));
		scan.close();
	}
	public static int salary_calc(int basicsal,int year_of_join) {
		double hra,da;
		if(basicsal<=10000) {
			hra=0.20;
			da=0.80;
		}
		else if(basicsal<=20000) {
			hra=0.25;
			da=0.90;
		}
		else{
			hra=0.30;
			da=0.95;
		}
		// Gross_salary = basic_salary + HRA + DA
		int salary=(int)(basicsal+ hra*basicsal + da*basicsal);
		//System.out.println(salary);
		int exp=2024-year_of_join;
		if(exp>3) {
			return salary+2500;
		}
		return salary;
	}
	
	public static int no_of_currencynotes(int amt) {
		int notes_cnt=0,note_2000=0;
		if(amt>=2000) {
			note_2000+=amt/2000;
			System.out.println("Number of 2000 notes: "+note_2000);
			amt-=(note_2000*2000);
			notes_cnt+=note_2000;
		}
		if(amt>=500) {
			int note_500 = amt/500;
			System.out.println("Number of 2000 notes: "+note_500);
			amt-=(note_500*500);
			notes_cnt+=note_500;
			
		}
		if(amt>=200) {
			int note_200 = amt/200;
			System.out.println("Number of 2000 notes: "+note_200);
			amt-=(note_200*200);
			notes_cnt+=note_200;
			
		}
		if(amt>=100) {
			int note_100 = amt/100;
			System.out.println("Number of 2000 notes: "+note_100);
			amt-=(note_100*100);
			notes_cnt+=note_100;
			
		}
		if(amt>=50) {
			int note_50 = amt/50;
			System.out.println("Number of 2000 notes: "+note_50);
			amt-=(note_50*50);
			notes_cnt+=note_50;
			
		}
		if(amt>=20) {
			int note_20 = amt/20;
			System.out.println("Number of 2000 notes: "+note_20);
			amt-=(note_20*20);
			notes_cnt+=note_20;
			
		}
		return notes_cnt;
	}
	
	
}
