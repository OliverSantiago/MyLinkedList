import java.util.*;
public class Tester{
  public static void main( String[]args ){
    // MyLinkedList test1 = new MyLinkedList();
    // test1.add("first");
    // //System.out.println(test1.toString());
    // test1.add("middle1");
    // test1.add("middle2");
    // //System.out.println(test1.toString());
    // test1.add(0,"newfirst");
    // //System.out.println(test1.toString());
    // test1.add(2, "MIDDLE");
    // //System.out.println(test1.toString());
    // test1.add(test1.size(), "last");
    // //System.out.println(test1.toString());
    // test1.set(0, "NEWFIRST");
    // //System.out.println(test1.toString());
    // test1.set(2, "Middle?");
    // //System.out.println(test1.toString());
    // test1.set(test1.size()-1, "last2");
    // // System.out.println(test1.toString());
    // // System.out.println(test1.get(0));
    // // System.out.println(test1.get(3));
    // // System.out.println(test1.get(test1.size()-1));
    // // System.out.println(test1.toStringReversed());
    // // System.out.println(test1.toString());
    // test1.remove(3);
    // // System.out.println(test1.toString());
    // MyLinkedList test2 = new MyLinkedList();
    // test2.add("1");
    // test2.add("2");
    // test2.add("3");
    // // System.out.println(test2.toString());
    // // test2.remove(0);
    // // System.out.println(test2.toString());
    // // test2.remove(0);
    // // System.out.println(test2.toString());
    // // test2.remove(0);
    // // System.out.println(test2.toString());
    // //System.out.println(test2.toString());
    // System.out.println(test1.toString());
    // System.out.println(test2.toString());
    // test1.extend(test2);
    // System.out.println(test1.toString());
    // System.out.println(test2.toString());
    MyLinkedList a = new MyLinkedList();
    MyLinkedList b = new MyLinkedList();
    for(int i = 0; i < 10; i++){
      if(i < 5){
        a.add(i+"");
      }else{
        b.add(i+"");
      }
    }
    System.out.println();
    System.out.println("A:"+a+a.size());
    System.out.println("B:"+b+b.size());

    a.extend(b);
    System.out.println("A:"+a+a.size());
    System.out.println("B:"+b+b.size());
    System.out.println("A reversed:"+a.toStringReversed()+a.size());
    System.out.println("B reversed:"+b.toStringReversed()+b.size());
  }
}