/*Write code to partition a linked list around a value x, such that
all nodes less than x come before all nodes greater than or equal to x.
lf x is contained within the list, the values of x only need to be after
 the elements less than x (see the book for an example). The partition
 element x can appear anywhere in the "right partition"; it does not need
 to appear between the left and right partitions.*/
public class Partition { //O(n) where n = nodes in list
    public static void main(String[] args) {
        OgLinkedList ls1 = new OgLinkedList();
        OgLinkedList rs = new OgLinkedList();
        OgLinkedList ls = new OgLinkedList();

        ls1.append("1");
        ls1.append("6");
        ls1.append("5");
        ls1.append("7");
        ls1.append("9");
        ls1.append("3");
        ls1.append("2");
        ls1.append("4");
        ls1.append("10");
        ls1.append("8");

        Node current = ls1.head;
        int partition = 5;
        int x;

        while(current.next != null) {
            x = Integer.valueOf(current.data);
             //if element < x, move left
            if (x > partition) {
                rs.append(current.data);
                ls1.remove(current);
                //if element > x, move right
            } if (x < partition) {
                ls.append(current.data);
                ls1.remove(current);
            }

            current = current.next;
        }
        //connect lists together in order
        ls1.tail.next = rs.head;
        ls.tail.next = ls1.head;
        ls1 = ls;
    }
}