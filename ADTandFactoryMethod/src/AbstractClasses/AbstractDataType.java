package AbstractClasses;

import Exceptions.IsEmptyException;
import Implementations.Node;

import javax.swing.*;

// Creates an abstract class to define common attributes and methods
public abstract class AbstractDataType {
    protected int size;

    public abstract void showData(JTextArea textArea) throws IsEmptyException ;
    public void updateTextArea(JTextArea textArea) throws IsEmptyException {
        showData(textArea);
    }
    // Validates if the structure is empty
    public void isEmpty (Node node, JTextArea textArea) throws IsEmptyException{
        if(node==null){
            textArea.setText("");
            throw new IsEmptyException("La estructura esta vacía");
        }
    };

    public abstract int addElement(JTextArea textArea, int value) throws IsEmptyException;
    public abstract void removeElement(JTextArea textArea) throws IsEmptyException;
}