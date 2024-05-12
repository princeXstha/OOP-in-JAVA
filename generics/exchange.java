import java.util.Arrays;
public class exchange{
    public static <i> void swap(i[]array,int i1,int i2){
        if(i1<0||i1>=array.length||i2<0||i2>=array.length){
            System.out.println("Invalid Indices\n");
        }
        i temp=array[i1];
        array[i1]=array[i2];
        array[i2]=temp;
    }
    public static void main(String args[]){
        Integer[] intArray={1,2,3,4,5};
        String[] stringArray={"apple","banana","cherry","date"};
        swap(intArray,1,3);
        swap(stringArray,0,2);
        System.out.println("Swapped integer array"+Arrays.toString(intArray));
        System.out.println("Swapped String array"+Arrays.toString(stringArray));
    }
}