class A2_P2_Pattern7{
	public static void main(String [] args){
		
		
		//for above half..
	for(int i=1; i<5; i++){
		//spaces
		for(int spaces=1; spaces<=5-i; spaces++){
			System.out.print(" ");
		}
		
		for(int j=1; j<i; j++){
			System.out.print("*");
		}
		
		for(int j=1; j<=i; j++){
			System.out.print("*");
		}
		System.out.println();
	}
	
	
	
	
	// for below half...
	for(int i=1; i<=5; i++){
		//spaces
		for(int spaces=1; spaces<i; spaces++){
			System.out.print(" ");
		}
		
		for(int j=1; j<5-i+1; j++){
			System.out.print("*");
		}
		
		for(int j=1; j<=5-i+1; j++){
			System.out.print("*");
		}
		System.out.println();
	} 
	}
}