class A2Pattern11{
	public static void main(String [] args){
		
		//spaces
		for(int i=0; i<=5; i++){
			//Spaces
			for(int spaces=0; spaces<=5-i; spaces++){
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
	}
}