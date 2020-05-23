/**
 * @author vivek
 *
 * Class to create Node for Trie DS
 */
class Node{

    private Node[] links;
    private boolean isEnd;

    public Node(){
        this.links = new Node[27];
        this.isEnd = false;
    }

    public boolean isEnd() {
        return this.isEnd;
    }

    public Node[] getLinks() {
        return this.links;
    }

    public void setEnd(boolean end) {
        this.isEnd = end;
    }

    public void setLinks(Node[] links) {
        this.links = links;
    }

    public boolean containsKey(char ch){
        return this.links[ch-'a']!=null;
    }
    
    public Node getLinks(char ch){
        return this.links[ch-'a'];
    }

    public void putNode(char ch, Node node){
        links[ch-'a'] = node;
    }
    
}