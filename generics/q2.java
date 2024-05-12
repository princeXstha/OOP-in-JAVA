import java.util.ArrayList;
import java.util.List;
public class q2{
    public static void main(String args[]){
    arrays<String> abc=new arrays<String>();
    abc.adding("prince");
    abc.adding("bicky");
    abc.adding("sajan");
    abc.adding("krish");
    abc.swap(0,3);
    abc.print();
    }
}
class arrays<i>{
    List <i> ar=new ArrayList<i>();
    void adding(i name){
        ar.add(name);
    }
    void swap(int i1,int i2){
        if(i1<0||i1>=ar.size()||i2<0||i2>=ar.size())
            System.out.println("invalid");
        i temp1=ar.get(i1);
        i temp2=ar.get(i2);
        ar.set(i1,temp2);
        ar.set(i2,temp1);
    }
    void print(){
        for(i f:ar){
        System.out.println(f);
    }
}
}