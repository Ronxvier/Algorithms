package Dijkstra;

import java.util.ArrayList;

public class DoubleStack {
    char value;
    ArrayList<Character> operatorStack= new ArrayList<>();
    ArrayList<Integer> valueStack = new ArrayList<>();
    public void valuePush(Integer input) {
        valueStack.add(input);
    }
    public Integer valuePop() {
        return valueStack.remove(valueStack.size()-1);
    }

    public void operatorPush(Character input) {
        operatorStack.add(input);
    }
    public Character operatorPop() {
        return operatorStack.remove(operatorStack.size()-1);
    }
}
