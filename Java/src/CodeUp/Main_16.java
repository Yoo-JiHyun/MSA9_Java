package CodeUp;

import java.util.Scanner;

public class Main_16 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = 1;
		
		int arr[][] = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = a++;
			}
				}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(arr[j][i] + " ");
				
			}
			System.out.println();
			
		}
	}
}

