class Unique {
    public int firstUniqChar(String s) {
        int i=0;
        int size=s.length();
        int prev;
        int newk;
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
        for(i=0;i<size;i++){
            char ch =s.charAt(i);
            if(map.containsKey(ch)){
                prev=map.get(ch);
                newk=prev +1;
                map.replace(ch,newk);}
            else
                map.put(ch,1);
            
        }
        int k=-1;
        for(Integer a : map.values()){
           k=k+a-1;
        if(a==1)
            break;
        }
        
        if(k==(size+1))
            k=-1;
        
        
        
        return k;


        
        
        
    }
}