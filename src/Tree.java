class Tree{
    Node root;


    public Node addToTree(Node current, String payload, int countNum){
        if (current == null){
            return new Node(payload, countNum);
        }

        if (countNum < current.countGen){
            current.left = addToTree(current.left, payload, countNum);
        } else if (countNum > current.countGen){
            current.right = addToTree(current.right, payload, countNum);
        } else {
            return current;
        }
        
        //premise for going left or rught in the tree. as it is string
        //
        return current;
    }

    public void addRoot(int countNum, String startVal) {
        root = addToTree(root, payload, countNum);
    }
    
}