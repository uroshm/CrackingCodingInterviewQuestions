package crackingcodeinterviewquestions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;

import org.junit.jupiter.api.Test;
import crackingcodeinterviewquestions.Chapter2.Node;

class Chapter2Test {

    @Test
    void appendOneNodeToAnother() {
        var node = new Node(1);
        node.appendToTail(2);
    
        assertEquals(1,node.getData());
        assertEquals(2,node.getNext().getData());
        assertEquals(null,node.getNext().getNext());
    }

    @Test
    void removeDups() {
        var node = new Node(1);
        node.appendToTail(1);
        node.getNext().appendToTail(4);
        node.deleteDups(node);

        assertEquals(1,node.getData());
        assertEquals(4,node.getNext().getData()); 
    }

}
