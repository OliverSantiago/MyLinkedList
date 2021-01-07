import java.util.*;
public class Tester{
  public static void main( String[]args ){
    MyLinkedList test1 = new MyLinkedList();
    test1.add("first");
    test1.add("second");
    test1.add("fourth");
    test1.add(2, "third");
    System.out.println(test1.toString());
  }
}