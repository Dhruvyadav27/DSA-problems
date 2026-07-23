class Solution {
    public long appealSum(String s) {
        int n = s.length();
        long totalAppeal = 0;
        long currentContribution = 0;
        
        int[] lastOccurrence = new int[26];
        
        for (int i = 0; i < 26; i++) {
            lastOccurrence[i] = -1;
        }
        
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int charIndex = ch - 'a'; 
            
            int prevIndex = lastOccurrence[charIndex];
    
            currentContribution += (i - prevIndex);
        
            totalAppeal += currentContribution;
            
            lastOccurrence[charIndex] = i;
        }
        
        return totalAppeal;
    }
}