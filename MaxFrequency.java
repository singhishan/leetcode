import java.util.HashMap;
import java.util.Scanner;

public class MaxFrequency {
    public static void main(String[] args) {
        System.out.println(" write string here ");
        Scanner scn =new Scanner(System.in);
        String str =scn.nextLine();
        int i=0;
        int mf=1;

        HashMap<Character,Integer> map = new HashMap<>();
        for(i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(map.containsKey(ch)){
                int prevf = map.get(ch);
                int newf = prevf+1;
                map.put(ch,newf);
            }else
                map.put(ch,1);

        }
             for(Character key :map.keySet()){
                 if(map.get(key)>map.get(str.charAt(0)))
                     mf=map.get(key);


             }
             System.out.println(mf);
    }
}