 class WordPattern2{
        Map<String, List<String>> map = new HashMap();

        public List<String> wordBreak(String s, List<String> wordDict) {
            if (map.containsKey(s))
                return map.get(s);
            List<String> result = new LinkedList<>();
            if (wordDict.contains(s))
                result.add(s);
            for (int i = 1; i <= s.length(); i++) {
                String left = s.substring(0, i);
                if (wordDict.contains(left)) {
                    for (String ss : wordBreak(s.substring(i), wordDict)) {
                        result.add(left + " " + ss);
                    }
                }
            }

            map.put(s, result);
            return result;
        }
    }