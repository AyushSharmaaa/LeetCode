class Solution {
   public static boolean isValid(String s) {
        Stack<Character> charStack = new Stack<>();
        char arr[] = s.toCharArray();
        for (int i = 0; i<arr.length;i++){
           if (arr[i]=='{'||arr[i]=='('||arr[i]=='['){
               charStack.push(arr[i]);
           }
           if (charStack.empty()) {
               return false;
           }
            if (arr[i]=='}'||arr[i]==')'||arr[i]==']') {
                if (charStack.peek() == '{' && arr[i] == '}') {
                    charStack.pop();
                } else if (charStack.peek() == '(' && arr[i] == ')') {
                    charStack.pop();
                } else if (charStack.peek() == '[' && arr[i] == ']') {
                    charStack.pop();
                }
                else {
                    return false;
                }
            }
        }

        if (charStack.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }
}