// Program 1: Reverse List
import java.util.*;
public class Program1_ReverseList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        for(int i=0;i<list.size()/2;i++){
            int temp=list.get(i);
            list.set(i,list.get(list.size()-1-i));
            list.set(list.size()-1-i,temp);
        }
        System.out.println(list);
    }
}