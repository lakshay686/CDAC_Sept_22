class A2_P3_Pattern6{
	public static void main(String [] args){
		
		
		
	for(int i=1; i<=9; i++){
		
		int n = i;
		
		//spaces
		for(int spaces=1; spaces<i; spaces++){
			System.out.print(" ");
		}
		
		
		
		
		for(int j=9; j>=i; j--){
			System.out.print("* ");
		}
		
		
		
		
		
		System.out.println();
	}
	}
}