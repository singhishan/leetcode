class AnagramG{
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> groupedAnagrams = new ArrayList<>();
        if(strs == null || strs.length == 0)
            return groupedAnagrams;
        
        Map<String,List<String>> map = new HashMap<>();
        for(String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            if(!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        groupedAnagrams.addAll(map.values());
        return groupedAnagrams;
    }
        
    }

