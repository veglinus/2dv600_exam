/**
 * Solution for 4
 */

public class IntBST {
    private BST root = null;

    public void add(int n) {
        if (root==null)
            root = new BST(n);
        else
            root.add(n);
    }

    public boolean contains(int n) {
        if (root==null)
            return false;
        else
            return root.contains(n);
    }

    private class BST {
        int value;
        BST left = null;
        BST right = null;
        BST(int val) { value = val; }

        void add(int n) {

            if (!this.contains(n)) {
                if (n < value) {

                    if (left == null) {
                        left = new BST(n);
                    } else {
                        left.add(n);
                    }
    
                } else if (n > value) {
    
                    if (right == null) {
                        right = new BST(n);
                    } else {
                        right.add(n);
                    }
    
                }
            }
        }

        boolean contains(int n) {

            if (value == n || left.value == n || right.value == n) {
                return true;
            } else {

                if (left != null && value > n) {
                    left.contains(n);
                } else if (right != null) {
                    right.contains(n);
                }

            }

            return false;
        }
    }
}
    