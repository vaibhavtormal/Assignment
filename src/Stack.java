public class Stack{
    int size;
    int[] stack;
    int top;

    public Stack(){
        size = 4;
        stack = new int[size];
        top = -1;
    }
    public Stack(int size)
    {
        this.size = size;
        this.stack = new int[size];
        this.top = -1;
    }
    public int peek(){
        return stack[top];
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == (size-1);
    }
    public boolean push(int data){
        if(isFull()){
            return false;
        }
        stack[++top] = data;
        return true;
    }
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int data;
        data = stack[top];
        stack[top] = 0;
        top --;
        return data;
    }
    public void show(){
        for(int n: stack)
            System.out.println(n);
    }
}