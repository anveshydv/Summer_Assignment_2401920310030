// Approach: HashMap + char[26] Frequency Key
// Build char[26] frequency array per word, convert to String as map key.
// All anagrams produce same key → grouped together automatically.
// Time Complexity: O(n*m) | Space Complexity: O(n*m)
//
// ⚠️ To run locally on any IDE:
// 1. Change class name from "Solution" to "GroupAnagrams"
// 2. Add main method to test:
//    public static void main(String[] args) {
//        GroupAnagrams sol = new GroupAnagrams();
//        System.out.println(sol.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
//    }
// 3. Add "import java.util.*;" at top

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>(strs.length * 2);

        for (String word : strs) {
            char[] key = new char[26];
            for (int i = 0; i < word.length(); i++) key[word.charAt(i) - 'a']++;
            map.computeIfAbsent(new String(key), k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(map.values());
    }
}