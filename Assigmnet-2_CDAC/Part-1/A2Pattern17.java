class A2Pattern17{
	public static void main(String [] args){
		int start=1;
		for(int i=1; i<=5; i++){
			
			
			for(int j=1; j<=i; j++){
				System.out.print(start+" ");
				start=start+1;
			}
			System.out.println();
		}
	}
}