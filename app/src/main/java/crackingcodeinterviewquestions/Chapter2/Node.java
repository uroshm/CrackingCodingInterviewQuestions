package crackingcodeinterviewquestions.Chapter2;

import java.util.HashSet;

public class Node {

    Node next = null;
    public Node getNext() {
        return next;
    }

    int data;
    public int getData() {
        return data;
    }

    public Node(int d) {
        data = d;
    }

    public void appendToTail(int d) {
        Node end = new Node(d);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    public void deleteDups(Node n) {
        var set = new HashSet<Integer>();
        Node previous = null;

        while(n != null) {
            if(set.contains(n.getData())) {
                if(previous != null) {}
                    previous.next = n.next;
            }
            else {
                set.add(n.getData());
                previous = n;
            }
            
            n = n.getNext();
        }
    }
}