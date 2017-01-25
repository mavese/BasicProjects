/**
 * class Node for the implementation of simple linked list. The node
 * contains only an item and a reference to the following Node
 */

/**
 * Author: Matthew Mantese
 * SID: 1491224
 * Section: 3
 */

public class Node<E> {

    /** Object contained in the Node */
    private E item;
    /** reference to the following node */
    private Node<E> next;
    private Node<E> precede;

    /** Contructor: create a new Node containing the specified item
     * @param newItem the item encapsulated in the node
     */
    public Node(E newItem) {
        item = newItem;
        next = null;
    } // end constructor

    /** Constructor: creates a new Node containing the specified item
     * and links this node to the specified node: this -> nextNode
     * @param newItem the item encapsulated in the node
     * @param nextNode the successor node of this node.
     */
    public Node(E newItem, Node<E> nextNode, Node<E> previousNode) {
        item = newItem;
        next = nextNode;
        precede = previousNode;
    } // end constructor

    /** set the item in the node
     * @param newItem the new item to be encapsulated in the node.
     */
    public void setItem(E newItem) {
        item = newItem;
    } // end setItem

    /** get the item encapsulated in the node
     * @return the object encapsulated in the node
     */
    public E getItem() {
        return item;
    } // end getItem

    /** set the reference to the following node
     * @param nextNode following node */
    public void setNext(Node<E> nextNode) {
        next = nextNode;
    } // end setNext

    /** get the following node
     * @returns the following node
     */
    public Node<E> getNext() {
        return next;
    } // end getNext

    public void setPrecede(Node<E> previousNode) { precede = previousNode; }

    public Node getPrecede(){ return precede; }
} // end class Node
