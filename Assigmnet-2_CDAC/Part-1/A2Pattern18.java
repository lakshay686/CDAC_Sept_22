class A2Pattern18{
	public static void main(String [] args){
		int start=1;
		for(int i=1; i<=5; i++){
			
			
			for(int j=1; j<=5-i+1; j++){
				System.out.print((char)('A'+j-1)+" ");
				start=start+1;
			}
			System.out.println();
		}
	}
}