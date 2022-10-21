/*Given a circular linked list, implement an algorithm that
 returns the node at the beginning of the loop.
 Definition:  Circular linked list: A (corrupt) linked list in
 which a node's next pointer points to an earlier node, so
as to make a loop in the linked list.
Example:
Input:  A ->  B -> C -> D ->  E -> C [the same C as earlier!]
Output: C*/
public class LoopDetect
{  /*
if no loop, return null*/
    //Big O: O(n)
    public static boolean findCircle(Node head)
    {
        if (head == null)
        {
            return false;
        }
        //use fast + slow pointers- slow travels 1 node at a time, fast travels 2 at a time
        Node slowPtr = head, fastPtr = head.next;
        //if there's a loop eventually fast will catch up with slow:
        //if they catch up on the same loop node eventually,
        while (slowPtr != fastPtr)
        {
          if (fastPtr == null || fastPtr.next == null)
            {
                return false;
            }
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        //print out node it's on when true
        System.out.println(fastPtr.next.next.data);
        return true;
    }
    public static void main(String[] args)
    {
        OgLinkedList circleList = new OgLinkedList();
        Node a = new Node("1");
        Node b = new Node("2");
        Node c = new Node("3");
        Node d = new Node("4");
        Node e = new Node("5");
        Node f = new Node("6");
        Node g = new Node("7");
        Node h = new Node("8");
        Node i = new Node("9");

        i.next = f; //circle value

        circleList.append(a);
        circleList.append(b);
        circleList.append(c);
        circleList.append(d);
        circleList.append(e);
        circleList.append(f);
        circleList.append(g);
        circleList.append(h);
        circleList.append(i);

        boolean bool;
        bool = findCircle(circleList.head);
        System.out.println(bool);


    }
}
