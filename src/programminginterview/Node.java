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
class Node{
    public Node next;
    public int val;
    public Node(int val)
    {
    this.val = val;
    }
    @Override
    public String toString()
    {
        return this.val+"->";
    }
}