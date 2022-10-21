public class OgLinkedList
{
    //reference variables
   public Node head;
   public Node tail;
   private int size;

   //constructor
    OgLinkedList()
    { //null = the absence of value
        head = null;
        tail = null;
        size = 0;

    }
    public void append(String newData) //function for adding node/element to the end
    {
        //check if head = null
        if(head == null)
        {
            //give head a value
            head = new Node(newData);
            tail = head; //need to assign value to tail, they'll be the same in this case
            //cant add things to tail, we dont want elements after tail.
            //so need to set tail = to new node (head)
            //System.out.println("head");

        }
        else
        {
          tail.next = new Node(newData); //make new node after tail
          tail = tail.next;  //then make tail = that new node, now they're
                              // both pointing to the same object that = null
           // System.out.println("tail");

        }
        size++; //increase size for if or else case for added node
        //add to next available spot
    }
    public void append(Node newNode) //function for adding node/element to the end
    {
        //check if head = null
        if(head == null)
        {
            //give head a value
            head = newNode;
            tail = head; //need to assign value to tail, they'll be the same in this case
            //cant add things to tail, we dont want elements after tail.
            //so need to set tail = to new node (head)
           // System.out.println("head");

        }
        else
        {
            tail.next = newNode; //make new node after tail
            tail = tail.next;  //then make tail = that new node, now they're
            // both pointing to the same object that = null
           // System.out.println("tail");

        }
        size++; //increase size for if or else case for added node
        //add to next available spot
    }


    public void insert(String newData, int index)
    { //for adding new element need temp variables for elements before/after new node
        Node current = head;

        //make temp node with data you want to insert
        Node temp = new Node(newData);

        if(index ==0)
        { //make node with new data and set it to current head
            temp.next = head;
            head = temp;
            size++;
        }
        else {
            for (int i = 0; i < index - 1 && i < size; i++) //want to stop at node before insert so we can make
                                                           //node before new one point to it
            {
                current = current.next;
            }
            //need to make sure you dont go beyond size
           if (index == size) {
                /*temp.next = current.next;
                current.next = temp;
                size++;*/
               append(newData);

           }
            else if(index <= size) //check to see if you're inserting new tail
            {
                 temp.next = current.next;
                current.next = temp;
                size++;
            }
        }
    }
    public void printList() {
        //make node to start at
        Node current = head;

        //iterate through nodes
        while (current != null) //while current is not tail
        {
            System.out.println(current.data);
            current = current.next; //move to next one
        }
    }
    public int getSize()

    {
        return size;
    }
    public void remove(Node delete) {
        Node current = head;

        while (current != null) {
            if (current.next == delete) {
                current.next = current.next.next;
                System.out.println("Node removed.");
            }
            current = current.next;
        }
    }
}
