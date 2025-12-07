package Stack_Queue.Dijkstra;

public class DoubleStack {
    int vN = 1;
    int oN = 1;
    Object[] operatorStack = new Object[1];
    Object[] valueStack = new Object[1];

    public void valuePush(Integer input) {
        if (vN>=valueStack.length)
            valueStack = resize(2*valueStack.length, valueStack);
        valueStack[vN++] = input;
    }

    public Object valuePop() {
        return valueStack[--vN];
    }

    public void operatorPush(Character input) {
        if (oN>=operatorStack.length)
            operatorStack = resize(2*operatorStack.length, operatorStack);
        operatorStack[oN++] = input;
    }
    public Object operatorPop() {
        return operatorStack[--oN];
    }

    public Object[] resize(int x, Object[] arr) {
        Object[] copy = new Object[x];
        for (int i = 0; i<arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }


}
