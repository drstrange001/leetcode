/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    
    public static void traversal(Node node, List<Integer> ans){
        if(node.children==null){
            ans.add(node.val) ;
            return;
        }
        
        ans.add(node.val);
        for (Node child: node.children){
            traversal(child, ans);
        }
    }
    
    public List<Integer> preorder(Node root) {
        List<Integer> ans= new ArrayList<>();
        if (root==null) return ans;
        traversal(root,ans);
        return ans;
    }
}