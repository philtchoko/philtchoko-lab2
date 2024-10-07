
public class ThingList {
    private Node head;
    
    static class Node {
        public Thing data;
        public Node next;
      }

    public void add(Thing thing){
        Node it = head;
        while(it != null){
            it = it.next;
        }
        Node newNode = new Node();
        it = newNode;
        it.data = thing;
    }
    

    public int size(){
        Node it = head;
        int count = 0;
        while(it != null){
            count++;
            it = it.next;
        }
        return count;
    }
    
    public void printAll(){
        Node it = head;
        while(it != null){
            System.out.println(it.toString());
            it = it.next;
        }
        
    }

}
