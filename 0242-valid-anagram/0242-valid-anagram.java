class Solution {
    public boolean isAnagram(String s, String t) {
        // Covert to lowercase
        s = s.toLowerCase();
        t = t.toLowerCase();

        // Check the Lengths
        if (s.length() != t.length())  return false;

        // Convert to char array
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        // Sort Arrays
        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);

        // Compare Arrays
        return Arrays.equals(sCharArray, tCharArray);
    }
}