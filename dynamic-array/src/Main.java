import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        ArrayList<String> arrayList = new ArrayList<String>();
        DynamicArray dynamicArray = new DynamicArray();

//        System.out.println(dynamicArray.capacity);
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");

        System.out.println(dynamicArray);
    }
}