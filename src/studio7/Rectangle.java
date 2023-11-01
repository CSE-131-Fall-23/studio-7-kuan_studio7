package studio7;

import edu.princeton.cs.introcs.StdDraw;


public class Rectangle {
		// instance variables	
		private String name;
		private double length;
		private double width;
		
		
		// constructor
		public Rectangle(String name, double length, double width) {
			this.name = name;
			this.length = length;  
			this.width = width; 
		}
		
		// calculate the area based on the length and width in which user input. 
		public double get_area(){
			return this.width*this.length;
		}
		
		public double get_perimeter() {
			return this.length*2 + this.length*2;
		}
		
		public String get_name() {
			return this.name;
		}
		
		public String compare_value(Rectangle other) {
			if (other.get_area()> this.get_area()) {
				return other.get_name() + " is larger";
			}
			else if (other.get_area()== this.get_area()) {
				return "They areas are the same.";
			}
			else {
				return this.get_name() + " is larger";
			}
		}
		
		public boolean check_square() {
			if (this.length == this.width) {
				return true;
			}
			return false;
		} 
		
		public void draw_square() {
			StdDraw.setXscale(0, 100);
	        StdDraw.setYscale(0, 100);
	        double centerX = 50;
	        double centerY = 50;
			StdDraw.setPenColor(StdDraw.BLACK);
			// Draw a filled rectangle
			StdDraw.filledRectangle(centerX, centerY, this.width/2, this.width/2);
			StdDraw.show();
		}
		   


		public static void main(String[] args){
			Rectangle test1 = new Rectangle("test1",12,12);
			Rectangle test2 = new Rectangle("test2",10,50);
			Rectangle test3 = new Rectangle("test3",10,50);
			System.out.println(test1.get_area());
			System.out.println(test1.get_perimeter());
			System.out.println(test1.compare_value(test2));
			System.out.println(test2.compare_value(test3));
			System.out.println(test1.check_square());
			System.out.println(test2.check_square());
			test1.draw_square();
			test2.draw_square();
		}
}
