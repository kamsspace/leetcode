// problem: 387. First Unique Character in a String
// difficulty: easy
// runtime 11ms, beats 67.64%
// memory: 44.79MB, beats 97.22%
class Solution {
    public int firstUniqChar(String s) {
        if (s.length() == 1) return 0;

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!set.contains(c)) {
                if (s.substring(i+1).indexOf(c) != -1) {
                    set.add(c);
                } else return i;
            }
        }

        return -1;
    }
}

// runtime 497ms, beats 5.17%
// memory: 46.56MB, beats 5.11%
class Solution {
    public int firstUniqChar(String s) {
        if (s.length() == 1) return 0;

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String sub = s.substring(i+1);
            if (!set.contains(c)) {
                if (sub.indexOf(c) != -1) {
                    set.add(c);
                } else return i;
            }
        }

        return -1;
    }
}
