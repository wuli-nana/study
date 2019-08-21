import java.util.Stack;

public class MainStack {
    Stack<Integer> normal = new Stack<>();
    Stack<Integer> min = new Stack<>();
    public void MinStak(){
    }
    public void push(int x){
        normal.push(x);
    }
    public void pop(){
        normal.pop();
        min.pop();
    }
    public int top(){
        return normal.peek();
    }
    public int setMain(){
        return min.peek();
    }

}
