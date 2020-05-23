package com.vivek.src;

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
    
    public 
    
}