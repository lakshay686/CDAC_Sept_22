class A2Pattern13{
	public static void main(String [] args){
		for(int i=1; i<=5; i++){
			//spaces
			for(int spaces=0; spaces<=5-i; spaces++){
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++){
				System.out.print((char)('A'+i-1)+" ");
			}
			System.out.println();
		}
	}
}