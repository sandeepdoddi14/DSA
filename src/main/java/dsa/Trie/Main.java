package dsa.Trie;

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        //trie.insert("pay");
        //trie.insert("attention");
        //trie.insert("practice");
        //trie.insert("attend");

        //System.out.println(trie.countWordsWithPrefix("pay"));

        //find common largest prefix
        trie.insert("flowers");
        trie.insert("flow");
        trie.insert("flight");

        for(int i=0;i<"flowers".length();i++)
        {
            String prefix =  "flowers".substring(0,i);
            System.out.println(prefix+"-->"+trie.countWordsWithPrefix(prefix));
        }
    }
}
