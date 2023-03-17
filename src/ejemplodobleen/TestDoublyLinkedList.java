/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplodobleen;

/**
 *
 * @author josed
 */
public class TestDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast(10);
        list.addLast(11);
        list.addLast(12);
        list.addLast(13);
        list.addLast(14);
        list.addFirst(9);
        list.addFirst(8);
        list.print();
    }
}