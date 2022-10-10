package alLeetC0d3;
import java.util.*;

class Solution{
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){this.val = val;}
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args){
        
    }

    //**Iterative Solution */
    public boolean hasPathSum(TreeNode root, int sum)
    {

        if(root == null) {return false;}

        Stack<TreeNode> nodeStack = new Stack(); // stack to keep track of node
        Stack<Integer> sumStack = new Stack(); // stack to keep track of current sum

        nodeStack.add(root);
        sumStack.add(sum - root.val);
        while (!nodestack.isEmpty())
        {
            TreeNode currentNode = nodeStack.pop();
            int currentSum = sumStack.pop();

            if (currentNode.left == null && currentNode.right == null && currentSum == 0)
            {
                return true;
            }

            if(currentNode.left != null){
                nodeStack.add(currentNode.left);
                sumStack.add(currentSum - currentNode.left.val);
            }

            if(currentNode.right != null){
                nodeStack.add(currentNode.right);
                sumStack.add(currentSum - currentNode.right.val);
            }
        }

        return false;


    }

    /**recursive solution 
     * 
     * THis solution breaks down each node as an individual,
     * it will keep calling as long as each "root" has a child until it doesn (reaches leaf)
     * 
    */

    // public boolean hasPathSum(TreeNode root, int sum){
    //     if (root == null) {
    //         return false;
    //     }else if(root.left == null && root.right == null && sum - root.val == 0) // checks to see if we're at an end node, and that
    //     {
    //         return true;
    //     }else {

    //         return hasPathSum(root.left, sum - root.val) || hasPathSum( root.right, sum - root.val);
    //     } 
       
    // }


    /**
     * Traverse tree, start at TargetSum
     * While you traverse tree, -Sum while you travel to leaf
     * If the sum = 0 at a leaf, you are done, return true else, return false.
     * 
     */
}

