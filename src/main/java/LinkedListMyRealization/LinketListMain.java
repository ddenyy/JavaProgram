package LinkedListMyRealization;

public class LinketListMain {

    public static void main(String[] args) {
        LinketListMain testList = new LinketListMain(0);
        testList.push_front(1);
        testList.push_front(2);
        testList.push_front(3);
        testList.push_front(4);
        testList.print();

        testList.delete(2);
        System.out.println();
        testList.print();

        System.out.println("\n === " + testList.get(3).info);
    }
    Node head;
    Node tail;

    int size = 0;

    LinketListMain(int first_data)
    {
        head = new Node(first_data);
        head.next = head.prev = head;
        size += 1;
    }

    public Node push_front(int data)
    {
        Node tmp = new Node(data);
        if (size == 1)
        {
            tail = tmp;
            head.next = tail;
            head.prev = null;
            tail.prev = head;
        } else
        {
            tail.next = tmp;
            tmp.prev = tail;
            tmp.next = null;
            tail = tmp;
        }
        size += 1;
        return tail;
    }

    public Node push_back(int data)
    {
        Node tmp = new Node(data);
        head.prev = tmp;
        tmp.next = head;
        tmp.prev = null;
        head = tmp;

        ++size;
        return tmp;
    }

    public Node get(int index)
    {
        Node tmp = new Node();
        tmp = head;
        if (index >= size && index < 0)
        {
            throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
        }

        for (int i = 0; i < index; i++)
        {
            tmp = tmp.next;
        }
        return tmp;
    }

    public Node delete(int index)
    {
        Node tmp = new Node();
        tmp = head;
        if (index >= size && index < 0)
        {
            throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
        }

        for (int i = 0; i < index; i++)
        {
            tmp = tmp.next;
        }

        tmp.prev.next = tmp.next;
        tmp.next.prev = tmp.prev;

        return tmp;
    }

    public void print()
    {
        Node tmp = new Node();
        tmp = head;

        int count = 0;
        while(tmp != null)
        {
            System.out.println(tmp.info + "   " + Integer.toString(count));
            count+=1;
            tmp = tmp.next;
        }
    }
}


