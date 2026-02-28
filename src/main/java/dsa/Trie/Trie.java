package dsa.Trie;

public class Trie {

    private Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            if(node.getChar(word.charAt(i))==null)
            {
                node.insert(word.charAt(i),new Node());
            }
            node = node.getChar(word.charAt(i));
            node.noOfOccurnaces++;
        }
        node.setEnd();
    }
     public boolean search(String word)
     {
         Node node = root;
         for(int i = 0 ; i<word.length();i++)
         {
             if(node.getChar(word.charAt(i))==null)
                 return false;
             node = node.getChar(word.charAt(i));
         }
         return node.isEnd();
     }

    public boolean startsWith(String word)
    {
        Node node = root;
        for(int i = 0 ; i<word.length();i++)
        {
            if(node.getChar(word.charAt(i))==null)
                return false;
            node = node.getChar(word.charAt(i));
        }
        return true;
    }

    public int countWordsWithPrefix(String prefix)
    {
        Node node = root;
        for(int i=0;i<prefix.length();i++){
            if(node.getChar(prefix.charAt(i))==null)
                return 0;
            node = node.getChar(prefix.charAt(i));
        }
        return  node.noOfOccurnaces;
    }





}
