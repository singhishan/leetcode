class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");
        if(pattern.length()!= words.length)
            return false;
        HashMap<Character,String> map=new HashMap<>();
        HashMap <String,Boolean> used=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            
            char ch =pattern.charAt(i);
            if(map.containsKey(ch)==false){
                if(used.containsKey(words[i])==true)
                    return false;
                else{
                    used.put(words[i],true);
                    map.put(ch,words[i]);
                }}
                else{
                    String matcch=map.get(ch);
                    if(matcch.equals(words[i])==false)
                        return false;
                        
                }
            }
        
    return true;}
        
    
}