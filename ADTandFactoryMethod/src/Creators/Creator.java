package Creators;

import AbstractClasses.AbstractDataType;
import Implementations.Queue;
import Implementations.Stack;

public class Creator {
    public static int structureStack=1;
    public static int structureQueue=2;

    public static AbstractDataType StuctureCreator(int Type){
        if(Type==1){
            return new Stack();
        }else if(Type==2){
            return new Queue();
        }
        return null;
    }
}