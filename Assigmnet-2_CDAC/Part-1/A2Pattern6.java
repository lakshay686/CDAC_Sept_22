class A2Pattern6{
	public static void main(String [] args){
		for(int i=1; i<=5; i++){
			
			//Spaces
			for(int spaces=1; spaces<=10-(2*i); spaces++){
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	
	}
}