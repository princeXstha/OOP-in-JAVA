public class synchronization implements Runnable{
	int tickets=3;
	static int i=1,j=2,k=3;
	public void bookticket(String name,int wantedtickets){
		if(wantedtickets<=tickets){
			System.out.println(wantedtickets+" booked to "+name);
			tickets=tickets-wantedtickets;
			}
		else{
			System.out.println("no tickers to book");
		}
	}
public void run(){
	String name=Thread.currentThread().getName();
	if(name.equals("t1")){ 
		bookticket(name,i);
		}
	else if(name.equals("t2"))
	{
		bookticket(name,j);
	}
	else{
		bookticket(name,k);
	}
}
public static void main(String[] args){
	synchronization sc=new synchronization();
	Thread sk=new Thread(sc);
	sk.setName("t1");
	sk.start();
	System.out.println("this is outside of the thread");
}
}