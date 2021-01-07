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
  
  public void add(int index, String value){
    Node n = new Node(value);
    if (index<0||index>size){
      throw new IndexOutOfBoundsException();
    }
    if (index == size){
      add(value);
    }else{
      if (index == 0){
        n.setNext(start);
        start.setPrev(n);
        start = n;
        size++;
      }else{
        
      }
    }
  }
  
  // private Node helper(int index){
  //   int answer = 0; 
  //   if (index<0||index>size){
  //     throw new IndexOutOfBoundsException();
  //   }
  //   Node current = start;
  //   //String answer = "";
  //   for (int i = 0; i < size; i++){
  //     //answer = current.getData();
  //     current = current.getNext();
  //     if (i == index){
  //       return current;
  //     }
  //   }
  //   return current;
  // }
  
  // public Node helper2(int index){
  //   return(helper(index));
  // }
  
  
  public String get(int index){
    if (index<0||index>size){
      throw new IndexOutOfBoundsException();
    }
    Node current = start;
    for (int i = 0; i < size; i++){
      if (i == index){
        return current.getData();
      }
      current = current.getNext();
    }
    return current.getData();
  }
  
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