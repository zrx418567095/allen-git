package com.allen.learning;

public class LittleSort {

	public static void main(String[] args) {
		for(int i=1;i<=7;i+=2){
			for(int kong=7;kong>i-1;kong--){
				System.out.print(" ");
			}
			for(int xing=1;xing<=i;xing++){
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int q=1;q<=5;q+=2){
			for(int i=1;i<q+3;i++){
				System.out.print(" ");
			}
			for(int j=5;j>=q;j--){
				System.out.print("* ");
			}
			System.out.println();
		}
	}	
}
