class A2_P3_Pattern5{
	public static void main(String [] args){
		
		
		
	for(int i=1; i<=9; i++){
		
		int n = i;
		
		//spaces
		for(int spaces=18; spaces>(2*i); spaces--){
			System.out.print(" ");
		}
		
		
		
		
		for(int j=9-i+1; j<9; j++){
			System.out.print(j+" ");
		}
		
		
		for(int j=9; j>=9-i+1; j--){
			System.out.print(j+" ");
		}
		
		
		System.out.println();
	}
	}
}