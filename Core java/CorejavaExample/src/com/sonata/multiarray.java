package com.sonata;

public class multiarray {
	public static void main(String args[]) {
		
		

		int[][] age= new int[4][3];
		age[0][0]=20;
		age[0][1]=30;
		age[0][2]=40;
		age[1][0]=50;
		age[1][1]=60;
		age[1][2]=70;
		age[2][0]=80;
		age[2][1]=90;
		age[2][2]=80;
		age[3][0]=70;
		age[3][1]=60;
		age[3][2]=50;
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++)
			System.out.println(age[i][j]);
		}

}
}