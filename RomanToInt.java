class Solution {
    public int romanToInt(String str) {
       if(str == null || str.length() == 0) {
           return 0;
       }
 
       
       Map<Character, Integer> charMap = new HashMap<>();
       charMap.put('I', 1);
       charMap.put('V', 5);
       charMap.put('X', 10);
       charMap.put('L', 50);
       charMap.put('C', 100);
       charMap.put('D', 500);
       charMap.put('M', 1000);
 
       int result = 0;
 
      
       for(int i = 0; i < str.length()-1; i++) {
 
             if(charMap.get(str.charAt(i)) >= charMap.get(str.charAt(i+1))) {
                result = result + charMap.get(str.charAt(i));
              } else {
                result = result - charMap.get(str.charAt(i));
              } 
        }

         result = result + charMap.get(str.charAt(str.length()-1));
 
        return result;
        
    }
}