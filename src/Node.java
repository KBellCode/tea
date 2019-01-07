class Node{
    String payload;
    int countGen;
    Node left;
    Node right;

    public Node(String payload, int countGen){
        this.payload = payload;
        this.countGen = countGen;
        left = null;
        right = null;
    }
}