import java.util.Stack;

public class reverse {
    public static String reverseString(String str){
        int idx=0;
        Stack<Character>s= new Stack<>();
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result= new StringBuilder("");
        while(!s.isEmpty()){
            char curr=s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String args[]){
        String str="HelloWorld";
        String result=reverseString(str);
        System.out.println(result);
    }
}
