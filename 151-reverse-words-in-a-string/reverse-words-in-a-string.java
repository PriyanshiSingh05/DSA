class Solution {
    public String reverseWords(String s) {
       // split my string into words
       // creating an array of split words only because it will be easier for me to reverse by using for loop and acccesing each word at a time by words[i];

       String[] words = s.split(" +");

       //reverse my words
       StringBuilder sb = new StringBuilder();
       for(int i = words.length-1; i >=0 ; i--){
        sb.append(words[i]);
        sb.append(" ");//extra space
    
       }return sb.toString().trim();
       

    }
}