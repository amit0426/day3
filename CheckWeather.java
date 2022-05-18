package com.masai;



	public class CheckWeather {
		
		
		
	static	void condition(boolean isSnowing, boolean isRaining,double temperature ) {
			
			if(isSnowing==true) {
				System.out.println("it's is snowing");
			}
			else
			{
				System.out.println("otherwise");
			}
			
			if(isRaining==true)
			{
				System.out.println("it is raining");
			}
			else
			{
				System.out.println("otherwise");
			}
			
			if(temperature<50)
			{
				System.out.println("Lets go OUt!");
			}
			else
			{
				System.out.println("otherwise");
			}
			
		}
		
		public static void main(String[] args) {

		//Assume these can have any value:
//		boolean isSnowing = false;
//		boolean isRaining = true;
//		double temperature = 60.0;
		
		condition(true,false,40 );
		

		//print "Let’s stay home." if its raining, snowing or
		//below 50 degrees and print "Let’s go out!" otherwise.

	}
	}


