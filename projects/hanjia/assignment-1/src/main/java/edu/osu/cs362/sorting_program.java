package edu.osu.cs362;

import java.util.Scanner;

public class sorting_program {
	public static void main(String[] args) {
		int[] sortit = new int[10];
		int n1;
		double avg = 0;
		int size = 0;
		int i = 0;

		Scanner read = new Scanner(System.in);
		System.out.println("This is a program helps you sort 10 number array and get average number of it");

		while (i < 10) {
			System.out.println( (i+1) + ". Enter an integer");
			do {
				System.out.println("Please enter an integer");
				while(!read.hasNextInt())read.next();
			}while(!read.hasNextInt());
			n1 = read.nextInt();
			sortit[i] = n1;
			i++;
			size = sortit.length;
		}

		avg = get_avg(sortit, size, avg);
		System.out.println("The average of this list is" + avg);

		sort_array(sortit);
		System.out.println("Your sorted array is:");
		for(int j = 0; j < size; j++){
			System.out.print(sortit[j] + " ");
		}

	}

	private static double get_avg(int[] sortit, int size, double avg){
		int i = 0;
		double sum = 0;
		while(i < size){
			sum = sum + sortit[i];
			i++;
		}
		avg = sum / size;
		return avg;
	}

	private static void sort_array(int[] sortit){
		int n = sortit.length;
		int temp;
		for(int i = 0; i < n; i++){
			for(int j = 1; j <(n-i); j++){
				if(sortit[j-1] > sortit[j]){
					temp = sortit[j-1];
					sortit[j-1] = sortit[j];
					sortit[j] = temp;
				}
			}
		}
	}
}

