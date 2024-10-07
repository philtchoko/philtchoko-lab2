
public class ThingList {
    public Node head;
    
     class Node {
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
            Thing thing = it.data;
            System.out.println(thing.tothingString());
            it = it.next;
        }
        
    }
    public void moveAll(){
        Node it = head;
        while (it != null){
           Thing thing = it.data;
           thing.maybeTurn();
           thing.step();

        }
    }


   

   

}
