package GUI;

import AbstractClasses.AbstractDataType;
import Creators.Creator;
import Implementations.Stack;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Creators.Creator.structureStack;

public class StackGUI {
    private JPanel pGeneral;
    private JTextField txtElement;
    private JTextArea textResponse;
    private JButton pushButton;
    private JButton popButton;
    private JLabel Element;
    AbstractDataType newStack = Creator.StuctureCreator(structureStack);

    public StackGUI() {
        pushButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String element = txtElement.getText();
                try{
                    int value = Integer.parseInt(element);
                    newStack.addElement(textResponse,value);
                    txtElement.setText("");
                    txtElement.grabFocus();
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
            }
        });
        popButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    newStack.removeElement(textResponse);
                    txtElement.setText("");
                    txtElement.grabFocus();
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("StackGUI");
        frame.setContentPane(new StackGUI().pGeneral);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
