package edu.jsu.mcis;
/*This is the first file
By: Christopher Burdette
    Nathan Chaney
    Kurtis Graben
    Khoi Phan
    Hui Wang
*/
private StringLinkedList sll = new StringLinkedList();

class StringLinkedList {
  private Node head;
  private int listCount = 0;

  public StringLinkedList() {
    head = new Node(null);
  }

  public void add(String data) {
    Node temp = new Node(data);
    Node current = head;
    while (current.getNext() != null) {
      current = current.getNext();
    }
    current.setNext(temp);
    count+=1;
  }
}

public static void main(String[] args) {

}

public String parseIn(String argument) {
  sll.add(argument);
}
