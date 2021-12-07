package com.sonata.area;

public class Area extends Shape implements AreaInterface {
	public double Areaofsquare(double length) {
		double x= length*length;
		return x;
		}
		public double Areaofrectangle(double length,double width) {
		double y=length*width;
		return y;
		}
		public double Areaoftriangle(double width,double breadth) {
		double z=(0.5)*(breadth*width);
		return z;
		}
		public static void main(String[] args) {
		Area s1=new Area();


		System.out.println(s1.Areaofsquare(5));
		System.out.println(s1.Areaofrectangle(5,6));
		System.out.println(s1.Areaoftriangle(5,6));


		}
}
