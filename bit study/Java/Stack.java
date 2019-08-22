import java.util.Arrays;

public class Stack {
    private int[] array = new int[10];
    private int top = 0;

    private void enSureCapacity() {
        if (top < array.length) {
            return;
        }
        array = Arrays.copyOf(array, array.length + 2);
    }

    public void push(int element) {
        enSureCapacity();
        array[top++] = element;
    }

    public int pop(int index) {
        return array[--top];
    }

    public int peek() {
        return array[top - 1];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int search(int element) {
        for (int i = 0; i < top; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }
}

