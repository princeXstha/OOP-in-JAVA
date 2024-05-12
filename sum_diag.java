import java.util.Scanner;
class sum_diag{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter rows");
		int r=in.nextInt();
		System.out.println("Enter column");
		int c=in.nextInt();
		int mat[][]=new int[r][c];
		int i,j,sum=0;
		System.out.println("Enter elements");
		for(i=0;i<r;i++){
			for(j=0;j<c;j++){
				mat[i][j]=in.nextInt();
				}
			}
			for(i=0;i<r;i++){
				for(j=0;j<c;j++){
					if(i==j){
					System.out.println("the element= "+mat[i][j]);
					sum=sum+mat[I][j];
					}
			}
		}
		System.out.println("the sum is= "+sum);
	}
}