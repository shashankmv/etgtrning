package com.sonata.annotation;


	class A{
		public void ShowMydata() {
			System.out.println("super class a");
		}
	}
	
		class B extends A{
			@Deprecated
			public void Show() {
				System.out.println("My show method");
			}
			@Override
			@SuppressWarnings("unchecked")
		public void ShowMydata() {
				System.out.println("super class b");
			}
		}
		public class markerAnnotation {
			public static void main(String[] args) {
				B x=new B();
				x.ShowMydata();
			}
		}

