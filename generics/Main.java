import java.util.ArrayList;
import java.util.List;
public class Main{
    public static void main(String args[]){
        arrays<student> o1=new arrays<student>();
        arrays<employee> o2=new arrays<employee>();
        o1.push(new student<String,Integer>("Prince",1234));
        o1.push(new student<String,Integer>("bicky",2345));
        o2.push(new employee<String,Integer>("ram",1222));
        o2.push(new employee<String,Integer>("shyam",1223));
        o1.pop();
        o2.pop();
        o1.display();
        o2.display();
    }
}
class arrays<i>{
    List <i> ar=new ArrayList<i>();
    void push(i item){
        ar.add(item);
    }
    void pop(){
        if(ar.isEmpty())
            System.out.println("empty\n");
        else{
           System.out.println(ar.get(ar.size()-1)+"is popped");
        }
    }
    void display(){
        for(i f:ar){
            System.out.println(f);
            
        }
        System.out.println(ar.toString());
    }
}
class employee<n,i>{
    n name;
    i id;
    employee(n name,i id){
        this.name=(n)name;
        this.id=(i)id;
    }
}
class student<n,i>{
     n name;
    i id;
    student(n name,i id){
        this.name=(n)name;
        this.id=(i)id;
    }
}