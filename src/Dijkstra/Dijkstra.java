package Dijkstra;

public class Dijkstra {
    public static void main(String[] args) {
        DoubleStack myList = new DoubleStack();
        String input = args[0];

        for (int i=0; i<input.length();i++) {
            Character x = input.charAt(i);
            if (Character.isDigit(x)) {
                myList.valuePush(Character.getNumericValue(x));
            } else if (x == '*' || x=='+' || x=='-' || x=='/') {
                myList.operatorPush(x);
            } else if (x==')') {
                int b = myList.valuePop();
                int a = myList.valuePop();
                char operator = myList.operatorPop();
                switch (operator) {
                    case '+':
                        myList.valuePush(a+b);
                        break;
                    case '-':
                        myList.valuePush(a-b);
                        break;
                    case '*':
                        myList.valuePush(a*b);
                        break;
                    case '/':
                        myList.valuePush(a/b);
                        break;
                }
            }
        }
        System.out.println(myList.valuePop());
    }
}
