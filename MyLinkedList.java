public class MyLinkedList{
  private int size;
  private Node start,end;  
  public MyLinkedList(){
    /*create a constructor*/
    size = 0;
    start = null;
    end = null;
  }
  
  public int size(){
    return size;
  }
  
  public boolean add(String value){
    Node n = new Node(value);
    if (size<1){
      start = n;
    }else{
      end.setNext(n);
      n.setPrev(end);
    }
    size++;
    end = n; 
    return true;
  }
  
  public boolean add(int index, String value){
    Node n = new Node(value);
    if (index<0||index>size){
      throw new IndexOutOfBoundsException();
    }
    if (index == size){
      return add(value);
    }else{
      if (index == 0){
        n.setNext(start);
        start.setPrev(n);
        start = n;
        size++;
        return true;
      }else{
        
      }
    }
    return true;
  }
  
  // private Node helper(int index){
  //   Node n = new Node(0);
  //   int answer = 0; 
  //   if (index<0||index>size){
  //     throw new IndexOutOfBoundsException();
  //   }
  //   //for ()
  //   return n;
  // }
  
  // public String get(int index);
  // public String set(int index, String value);
  
  public String toString(){
    String answer = "";
    Node current = start;
    for (int i = 0; i < size-1; i++){
      answer+=current.getData()+", ";
      current = current.getNext();
    }
    answer+=current.getData();
    return answer;
  }
  
  //Any helper method that returns a Node object MUST BE PRIVATE!
}