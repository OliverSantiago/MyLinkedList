import java.util.*;
public class Tester{
  public static void main( String[]args ){
    MyLinkedList test1 = new MyLinkedList();
    test1.add("one");
    System.out.println(test1.toString());
    test1.add("two");
    test1.add("three");
    System.out.println(test1.toString());
    test1.add(0,"one half");
    System.out.println(test1.toString());
    test1.add(2, "one and one half");
    System.out.println(test1.toString());
    test1.add(4, "two and one half");
    System.out.println(test1.toString());
    test1.set(0, "1/2");
    System.out.println(test1.toString());
    test1.set(2, "1 1/2");
    System.out.println(test1.toString());
    test1.set(5, "tres");
    System.out.println(test1.toString());
    System.out.println(test1.get(0));
    System.out.println(test1.get(3));
    System.out.println(test1.get(test1.size()-1));
  }
}