package com.sonata;

public class TShirt {
	String color;
	String material;
	String design;
	public TShirt(String c, String m, String d) {
		this.color=c;
		this.design=d;
		this.material=m;
	}
	
	public void display() {
		System.out.println("Product color is:" + color);
		System.out.println("Product material is :" + material);
		System.out.println("Product design is:" + design);
		
	}
	public static void main(String[] args) {
		TShirt small = new TShirt("black", "jeans", "fit") ;
		TShirt large = new TShirt("blue", "cotton", "jauguar") ;
		TShirt xl = new TShirt("White", "silk", "barma") ;
		System.out.println("\nSmall Size Details:");
		small.display();
		
		System.out.println("\nlarge size Details:");
		large.display();
		
		System.out.println("\nxl Size Details:");
		xl.display();
	}

}

