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
    public void push(JTextArea textArea, int data)throws IsEmptyException{
        Node newNode = new Node(data);
        newNode.setNext(top);
        top = newNode;
        size++;
        updateTextArea(textArea);
    }
    public int pop(JTextArea textArea)throws IsEmptyException{
        isEmpty(this.top, textArea);
        int data= top.getData();
        top = top.getNext();
        size--;
        updateTextArea(textArea);
        return data;
    }

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