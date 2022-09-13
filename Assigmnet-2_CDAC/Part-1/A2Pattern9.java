class A2Pattern9{
	public static void main(String [] args){
		
		
		for(int i=1; i<=5; i++){
			
			//spaces
			for(int spaces=1; spaces<=5-i; spaces++){
				System.out.print(" ");
			}
			
			
			//values
			for(int j=1; j<=i; j++){
				System.out.print((char)('A'+j-1)+" ");
			}
			System.out.println();
		}
		
		
		
	
	}
}