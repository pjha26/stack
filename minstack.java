class minstack {
       Stack<Integer>s;
       Stack<Integer>mins;
    public MinStack() {
        s=new Stack<>();
        mins=new Stack<>();
    }
    public void push(int val) {
        s.push(val);
        if(mins.isEmpty()||val<=mins.peek()){
            mins.push(val);
        }
    }
    public void pop() {
     if(s.isEmpty())return;//agar poora stack khali hai tb uske liye
     int top=s.pop();
     if(!mins.isEmpty() &&top==mins.peek()){
        mins.pop();
     }
    }
    public int top() {
     return s.peek();   
    }
    public int getMin() {
     return mins.peek();   
    }
    public static void main(String[] args) {
        
    }
}

