package university;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Stack;

public class StackTest {

    @Test
    public void testPush() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.size());
    }

    @Test
    public void testPop() {
        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        assertEquals("c", stack.pop());
        assertEquals("b", stack.pop());
        assertEquals("a", stack.pop());
    }

    @Test
    public void testPeek() {
        Stack<Double> stack = new Stack<>();
        stack.push(3.14);
        stack.push(2.71);
        assertEquals(2.71, stack.peek(), 0.0001);
        assertEquals(2, stack.size());
    }

    @Test
    public void testIsEmpty() {
        Stack<Boolean> stack = new Stack<>();
        assertTrue(stack.isEmpty());
        stack.push(true);
        assertFalse(stack.isEmpty());
    }
}
