class A2Pattern10{
	public static void main(String [] args){
		
		
		for(int i=1; i<=5; i++){
			
			//spaces
			for(int spaces=1; spaces<=5-i; spaces++){
				System.out.print(" ");
			}
			
			
			//values
			for(int j=5-i; j<=4; j++){
				System.out.print((char)('A'+j)+" ");
			}
			System.out.println();
		}
		
		
		
	
	}
}