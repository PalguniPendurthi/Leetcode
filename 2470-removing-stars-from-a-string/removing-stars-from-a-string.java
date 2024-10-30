class Solution {
    public String removeStars(String s) {
        Stack<Character> stack=new Stack<>();
        char[] a=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(a[i]=='*' && !stack.isEmpty()){
                stack.pop();
            }else if(a[i]=='*' && stack.isEmpty()){
                return "";
            }else{
                stack.push(a[i]);
            }
        }
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }
        
        return result.toString();

    }
}