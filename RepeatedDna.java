 class RepeatedDna {
        public List<String> findRepeatedDnaSequences(String s) {
            Set<String> set = new HashSet(), repeated = new HashSet();
            for (int i = 0; i < s.length() - 9; i++) {
                String dna = s.substring(i, i + 10);
                if (set.contains(dna))
                    repeated.add(dna);
                set.add(dna);
            }
            return new ArrayList(repeated);
        }
    }


    class Solution2 {
        public List<String> findRepeatedDnaSequences(String s) {
            Map<String, Integer> freq = new HashMap();
            for (int i = 0; i < s.length() - 9; i++) {
                String dna = s.substring(i, i + 10);
                freq.put(dna, freq.getOrDefault(dna, 0) + 1);
            }

            List<String> list = new ArrayList();
            for (Map.Entry<String, Integer> e : freq.entrySet())
                if (e.getValue() > 1)
                    list.add(e.getKey());

            return list;
        }
    }