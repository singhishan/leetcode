class IntToR{
    public String IntToRoman(int num) {
        Map<String, Integer> mp = new LinkedHashMap<>();
        mp.put("M", 1000);
        mp.put("CM",900);
        mp.put("D", 500);
        mp.put("CD", 400);
        mp.put("C", 100);
        mp.put("XC", 90);
        mp.put("L", 50);
        mp.put("XL", 40);
        mp.put("X", 10);      
        mp.put("IX", 9);
        mp.put("V", 5);
        mp.put("IV", 4);
        mp.put("I", 1);
        
        String  sb = "";
        
        for(Map.Entry<String, Integer> entry : mp.entrySet()) {
            
            while(num >= entry.getValue()) {
                num = num - entry.getValue();
                sb=sb + entry.getKey();
            }
        }
        
        return sb.toString();
        
    }
}