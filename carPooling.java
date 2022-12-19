import java.util.ArrayList;
class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int numTrips;
        ArrayList<Integer> al = new ArrayList<Integer>();
        numTrips = trips.length;
        for(int i=0;i<numTrips;i++){
            if(trips[i][0] > capacity)
                return false;
        }
        for(int tra:al)
            tra=0;
        
        for(int j=0;j<numTrips;j++){
            al.put(trips[j][1],trips[j][0]);
        }
        for(int k=0;k<numTrips;k++){
            al.put(trips[k][2],-trips[k][0]);
        }
        int lastDrop=0;
        for(int s=0;s<numTrips;s++){
            if(trips[s][2]>trips[s+1][2])
                lastDrop=trips[s][2];
            else
                lastDrop=trips[s+1][2];
                
        }
        for(int l=1;l<lastDrop+1;l++)
        {
            al.set(l,al.get(l-1)+al.get(l));
        } 
        for(int i:al){
            if(i>capacity)
                return false;
            
        }
        return true;
        
        
        
    }
}