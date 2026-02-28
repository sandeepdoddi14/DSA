package dsa.Trie;


public class Node {
    Node[] links = new Node[26];
    Boolean flag = false;
    int noOfOccurnaces;

    public Boolean containsKey(char ch) {
        return links[ch - 'a'] != null;
    }

    public void insert(char ch, Node node) {
        links[ch - 'a'] = node;
    }

    public Node getChar(char ch) {
        return links[ch - 'a'];
    }

    public void setEnd() {
        flag = true;
    }

    public boolean isEnd() {
        return flag;
    }

}
