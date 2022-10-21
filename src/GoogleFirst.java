/*Remove a node from a singly linked list without
knowing the head node. All you have is the node itself.*/
public class GoogleFirst
{ //O(n) where n is nodes in list
    public static void main(String[] args)
    {

            OgLinkedList ls1 = new OgLinkedList();
            Node givenNode = new Node("9");

            ls1.append("1");
            ls1.append("6");
            ls1.append("5");
            ls1.append("7");
            ls1.append(givenNode);
            ls1.append("3");
            ls1.append("2");
            ls1.append("4");
            ls1.append("10");
            ls1.append("8");


            Node current = givenNode;

            while(current.next != null)
            {   //copy next node about to be deleted to current node
                //then delete new current/move forward
                current.data = current.next.data;
                if (current.next.next == null)
                {
                    current.next = null;
                }
            }

            ls1.printList();

        }
    }



