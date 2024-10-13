class StackOverFlow extends Exception{
    @Override
    public String toString(){
        return "Stack Overflow Error, no more space to push elements";
    }
}
class StackUnderFlow extends Exception{
    @Override
    public String toString(){
        return "Stack Underflow Error, no more element to delete";
    }
}

class Stack{
    int size;
    int top = 0;
    int stk[];

    Stack(){
        this.size = 0;
        stk = new int[size];
    }
    
    Stack(int size){
        this.size = size;
        stk = new int[size];
    }

    public void push(int num) throws StackOverFlow{
        
        if(top>=size){
            throw new StackOverFlow();
        }else{
           stk[top] = num;
            top++; 
        }
    }

    public int pop() throws StackUnderFlow{
        
        if(top>=size){
            throw new StackUnderFlow();
        }else{
            int element = stk[top];
            stk[top] = -1;
            top--;
            return  element;
        }
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        try {
            Stack stk = new Stack(5);
            for (int i = 0; i < 10; i++) {
                stk.push(i);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }   
}
