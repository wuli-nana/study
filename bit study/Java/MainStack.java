import java.util.Stack;

public class MainStack {
    Stack<Integer> normal = new Stack<>();
    Stack<Integer> min = new Stack<>();
    public void push(int x){
        normal.push(x);
        if(min.empty()){
            min.push(x);
        }else{
            int m = min.peek();
            if( m >= x){
                min.push(x);
            }
            else {
                min.push(m);
            }
        }
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
