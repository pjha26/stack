import java.util.Arrays;
import java.util.Stack;

class dailytemp {
    public int[] dailyTemperatures(int[] temperatures) {
       Stack<Integer>s=new Stack<>();
       int[] output=new int[temperatures.length];
       for(int i=temperatures.length-1;i>=0;i--){
         while(!s.isEmpty()&&temperatures[s.peek()]<=temperatures[i]){
        s.pop();
       } 
       if(s.isEmpty()){
        output[i]=0;
       }
       else{
        output[i] = s.peek() - i;
       }
       s.push(i);
    }
 return output;
       }
       public static void main(String[] args) {
        
        Solution sol = new Solution();

        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};

        int[] result = sol.dailyTemperatures(temperatures);

        System.out.println(Arrays.toString(result));
       }
}
