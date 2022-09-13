class A2_P2_Pattern6{
	public static void main(String [] args){
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