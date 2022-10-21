public class Node {
    //create public object for data
    protected String data;
   // public Node next; //these are public so other classes can use them

    //node after node being referenced
    protected Node next; //open to children etc, is between public + private
    //if private we have to use getters + setters

    //constructor for node
    Node(String newValue) { //set a parameter for String
        next = null;
        data = newValue;  //set data = String parameter
    }
}
