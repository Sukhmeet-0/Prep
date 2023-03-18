public class Trie {
    private Node root;
    public Trie(){
        root=new Node();
    }
    private class Node{
        private Node[]children;
        private boolean isWord;

        public Node(){
            this.children=new Node[26];
            this.isWord=false;
        }
    }
    public void insert(String word){
        Node current =root;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            int index=c-'a';
            if(current.children[index]==null){
                Node node=new Node();
                current.children[index]=node;
                current=node;
            }else{
                current=current.children[index];
            }
        }
        current.isWord=true;
    }
    public boolean search(String word){

        return false;
    }
    public static void main(String[] args) {
        Trie t=new Trie();
        t.insert("cat");
        t.insert("car");
        t.insert("son");
        t.insert("so");
        System.out.println("Values inserted successfully !!");
    }
}
