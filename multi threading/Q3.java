public class Q3{
    public static void main(String args[]){
    resource ob=new resource();
    produce p=new produce(ob);
    consume c=new consume(ob);
    c.start();
    p.start();
    }
}
class produce extends Thread{
    resource ob;
    produce(resource ob){
        this.ob=ob;
    }
    public void run(){
        ob.producer();
    }
}
class consume extends Thread{
    resource ob;
    consume(resource ob){
        this.ob=ob;
    }
    public void run(){
        ob.consumer();
    }
}
class resource{
    public void producer(){
        synchronized(this){
        System.out.println("Order is being prepared\n");
        notify();
        System.out.println("Still being prepared\n");
        }
    }
    public void consumer(){
        synchronized(this){
             System.out.println("Order placed\n");
            try{
                wait();
              }
            catch(InterruptedException e){
                System.out.println("interrupted");
            }
        System.out.println("order recieved\n");
    }
}
}