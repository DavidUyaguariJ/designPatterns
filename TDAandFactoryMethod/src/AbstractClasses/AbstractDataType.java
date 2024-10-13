package AbstractClasses;

import Exceptions.IsEmptyException;
import Implementations.Node;

import javax.swing.*;

public abstract class AbstractDataType {
    protected int size;

    public abstract void showData(JTextArea textArea) throws IsEmptyException ;
    public void updateTextArea(JTextArea textArea) throws IsEmptyException {
        showData(textArea);
    }
    public void isEmpty (Node node) throws IsEmptyException{
        if(node==null){throw new IsEmptyException("La estructura esta vacía");}
    };
}