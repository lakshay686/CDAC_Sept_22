class A2_P2_Pattern2{
	public static void main(String [] args){
		
		for(int i=1; i<=5; i++){
			
			
			//spaces
			for(int spaces=1; spaces<=5-i; spaces++){
				System.out.print(" ");
			}
			
			
			for(int j=1; j<=i; j++){
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
}