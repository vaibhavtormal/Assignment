public class Main {
    public static void main(String[] args){

        Stack num = new Stack();

        System.out.println(num.isEmpty());



        num.push(1);
        num.push(2);
        num.push(3);
        num.push(4);

        System.out.println(num.isEmpty());
        System.out.println(num.peek());

        System.out.println(num.isFull());

        System.out.println();

        num.show();
        num.pop();
        num.pop();
        System.out.println();
        num.show();
    }
}