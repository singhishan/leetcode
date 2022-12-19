public List<List<String>> Anagrams(String[] strs) {
	List<List<String>> ans = new ArrayList<>();
	HashMap<String,List<String>> hm = new HashMap<>();
	for(String i : strs){
	   char [] charr= i.toCharArray();
		Arrays.sort(charr);
		String sortstr= new String(charr);
		if(!hm.containsKey(sortstr)){
			hm.put(sortstr,new ArrayList<String>());
		}
		hm.get(sortstr).add(i);
	}
	 for(String i : hm.keySet()){
		  ans.add(hm.get(i));
	 }
	return ans;
}