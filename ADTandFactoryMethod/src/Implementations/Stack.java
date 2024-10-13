package Implementations;

import AbstractClasses.AbstractDataType;
import Exceptions.IsEmptyException;

import javax.swing.*;

public class Stack extends AbstractDataType {
    private Node top;

    public Stack() {
        top = null;
        size = 0;
    }
    // This method add an item from the stack
    @Override
    public int addElement(JTextArea textArea, int data)throws IsEmptyException{
        Node newNode = new Node(data);
        newNode.setNext(top);
        top = newNode;
        size++;
        updateTextArea(textArea);
        return data;
    }
    // This method deletes the first item from the stack
    public void removeElement(JTextArea textArea)throws IsEmptyException{
        isEmpty(this.top, textArea);
        int data= top.getData();
        top = top.getNext();
        size--;
        updateTextArea(textArea);
    }
    // Overrides the parent method and adds logic to display the structure's data
    @Override
    public void showData(JTextArea textArea) throws  IsEmptyException{
        isEmpty(this.top, textArea);
        StringBuilder stackStr= new StringBuilder();
        Node currentNode = this.top;
        while(currentNode!=null){
            stackStr.append(currentNode.getData()).append("\n");
            currentNode = currentNode.getNext();
        }
        textArea.setText(stackStr.toString());
    }
}