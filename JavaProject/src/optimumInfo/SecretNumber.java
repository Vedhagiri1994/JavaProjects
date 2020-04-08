package optimumInfo;

public class SecretNumber {
	
	int secret[]={4};
	
	public static void main(String[] args) {
		
		int secret[]={9};
		recycleSecret(secret);
		System.out.println(secret[0]);
	}
	
	public static void recycleSecret(int secret[]){
		int newSecret[]={7};
		secret=newSecret;
	}

}
