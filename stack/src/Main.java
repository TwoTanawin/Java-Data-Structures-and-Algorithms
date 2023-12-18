import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

//        System.out.println(stack.empty());
        stack.push("Mincraft");
        stack.push("Skyrim");
        stack.push("DOOM");

//        stack.pop();

//        String myFavGam = stack.pop();

//        System.out.println(stack);
//        System.out.println(stack.peek());
//        System.out.println(stack.search("DOOM888"));
//        System.out.println(myFavGam);

        for(int i=0; i < 1000000; i++){
            stack.push("DOOM888");
        }


    }
}