import java.util.Scanner;
public class Q2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        System.out.println("Enter the values\n");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        matrix obj1=new matrix(arr[0]);
        matrix obj2=new matrix(arr[1]);
        matrix obj3=new matrix(arr[2]);
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        Thread t3=new Thread(obj3);
    t1.start();
    try{
	    t1.join();
	}
	catch(InterruptedException e){
	    System.out.println("interrupted");
	}
    t2.start();
    try{
	    t2.join();
	}
	catch(InterruptedException e){
	    System.out.println("interrupted");
	}
    t3.start();
    try{
	    t3.join();
	}
	catch(InterruptedException e){
	    System.out.println("interrupted");
	}
	int s1=obj1.getsum();
	int s2=obj2.getsum();
	int s3=obj3.getsum();
	int sumt=s1+s2+s3;
	System.out.println("sum total="+sumt);
    }
}
class matrix implements Runnable{
    int a[],i,j,sum=0;
    matrix(int arr[]){
        a=arr;
    }
    public void run(){
    for(i=0;i<3;i++){
        sum=sum+a[i];
    }
    System.out.println("sum="+sum);
    }
    public int getsum(){
        return sum;
    }
}