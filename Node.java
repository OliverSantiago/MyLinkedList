public class Node{
  
  private String data;
  private Node next,prev;
   
  public Node(String value){
    data = value;
    next = null;
    prev = null;
  }
//write get/set methods for all three instance variables.
  
  public String getData(){
    return data;
  }
  
  public Node getNext(){
    return next;
  }
  
  public Node getPrev(){
    return prev;
  }
  
  public String setData(String value){
    String temp = data;
    data = value;
    return temp;
  }
  
  public Node setNext(Node value){
    Node temp = next;
    next = value;
    return temp;
  }
  
  public Node setPrev(Node value){
    Node temp = prev;
    prev = value;
    return temp;
  }
}