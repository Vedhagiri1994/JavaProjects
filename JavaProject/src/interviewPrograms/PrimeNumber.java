package interviewPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=11,count=0;
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				count=1;
				break;
			}
		}
		if(count==0){
			System.out.println("Prime no");
		}
		else{
			System.out.println("Not Prime No");
		}
	}

}
