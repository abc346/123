import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		int n1, n2;
		int sum=0;
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter n1 n2");
		n1 = input.nextInt();
		n2 = input.nextInt();
		while(n1>=0 && n2>=0){
			sum = 0;
			for(int i=n1;i<=n2;i++){
			  sum += i;
			}
			System.out.printf("sum(%d,%d) = %d\n",n1,n2,sum);
			System.out.printf("Enter n1 n2");
			n1 = input.nextInt();
			n2 = input.nextInt();
			
	}

}
}
/*
int main(){
	int n1, n2;
	int sum=0;
	printf("Enter n1 n2: ");
	scanf("%d %d",&n1, &n2);
	while(n1>=0 && n2>=0){
		sum = 0;
		for(int i=n1;i<=n2;i++){
		  sum += i;
		}
		printf("sum(%d,%d) = %d\n",n1,n2,sum);
		printf("Enter n1 n2: ");
		scanf("%d %d",&n1, &n2);
	}
}
*/