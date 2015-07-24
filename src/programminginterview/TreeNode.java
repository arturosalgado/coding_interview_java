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
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
    
    @Override
    public String toString()
    {
        return this.val+"";
    }
    
    
    
    
}
