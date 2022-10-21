/*Given a linked list of elements (say integers)
and an array (of integers) delete elements from the
linked list that are found in the array.*/
public class GoogleSecond
{
    //O(n * a) where n = nodes in list, a = elements in array
    public static void main(String[] args) {
        OgLinkedList ls1 = new OgLinkedList();

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

        int arr[] = {6,3,2};

        Node current = ls1.head;

        while(current.next != null)
        {
            int x = Integer.valueOf(current.data);

            for (int i = 0; i < arr.length; i++)
                if (x == arr[i]) {
                    current.next = current.next.next;
                }
        }

        ls1.printList();
    }
}
