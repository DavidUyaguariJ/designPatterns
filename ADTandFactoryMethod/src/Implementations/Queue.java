package Implementations;

import AbstractClasses.AbstractDataType;
import Exceptions.IsEmptyException;

import javax.swing.*;

public class Queue extends AbstractDataType {
    private Node front;
    private Node rear;

    public Queue() {
        front = null;
        rear = null;
        size=0;
    }
    @Override
    public int addElement( JTextArea textArea, int data) throws IsEmptyException {
        Node newNode = new Node(data);
        if(front==null){
            front = newNode;
            rear = newNode;
        }else{
            rear.setNext(newNode);
            rear = newNode;
        }
        size++;
        updateTextArea(textArea);
        return data;
    }
    @Override
    public void removeElement(JTextArea textArea) throws IsEmptyException {
        isEmpty(front, textArea);
        int data = front.getData();
        front = front.getNext();
        size--;
        if(front==null){
            rear = null;
        }
        updateTextArea(textArea);
    }
    @Override
    public void showData(JTextArea textArea) throws IsEmptyException{
        isEmpty(front,textArea);
        StringBuilder queueStr= new StringBuilder();
        Node currentNode = front;
        while(currentNode!=null){
            queueStr.append(currentNode.getData()).append("\n");
            currentNode = currentNode.getNext();
        }
        textArea.append(queueStr.toString());
    }
}
