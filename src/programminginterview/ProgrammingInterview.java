/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programminginterview;

/**
 *
 * @author arturo
 */
public class ProgrammingInterview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // reverse Linked List 
        Node h = createList(100);
        print(h);
        Node r = reverse(h);
        print(r);
        
        // sqrRoot
        double sVal = 4000000;
        double root = SquareRoot.sqrt(sVal);
        System.out.println("square root of "+sVal+" is "+root);
        
    }
    static Node createList()
    {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        
        n1.next = n2;
        n2.next = n3;
        
        return n1;
        
    }
    
    static Node createList(int elements)
    {
        Node h = new Node(0);
        Node head = h;
        for(int i = 1; i<elements; i++)
        {
           Node t = new Node(i);
           h.next = t;
           h = t;
        }
        return head;
                
    }
    
    static Node reverse(Node h)
    {
        if (h==null || h.next==null)
            return h;
        else
        {
            Node r = reverse(h.next);
            h.next.next=h;
            h.next = null;
            return r;
        }
    }
    
    static void print(Node h)
    {
        Node t = h;
        while(t!=null)
        {
            System.out.print(t);
            t = t.next;
        }
        System.out.println("");
    }
}


