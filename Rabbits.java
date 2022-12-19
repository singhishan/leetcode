import java.util.*;
class Rabbits {
    public int numRabbits(int[] answers) {
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i:answers)
        map.put(i,map.getOrDefault(i,0)+1);
        
        int ans=0;
        for(int key:map.keySet()){
            int gs=key+1;
            int reportees=map.get(key);
            int ng=(int)Math.ceil(reportees*1.0/gs*1.0) ; 
            ans +=ng*gs;
        }
        return ans;
        
    }
}