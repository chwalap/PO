package kata;

import java.util.*;

public class Calculator {

    double compute(String input) {
        List<String> symbols = tokenize(input);
        return 0;
    }


    private List<String> ONP(String[] expressions) {
        if (expressions.length == 0) {
            return null;
        }
        List <String> result = new ArrayList<>();
        Queue<String> Q = new LinkedList<>();
        Deque<String> stack = new ArrayDeque<String>();
        int i = 0;

        while (i != expressions.length) {
            String symbol = expressions[i++];
            if (isInteger(symbol)) {
                Q.add(symbol);
            } else if (isOperator(symbol)) {

            }


        }



        return result;
    }

    private boolean isOperator(String symbol) {
        if ("+".equals(symbol)) return true;
        if ("-".equals(symbol)) return true;
        if ("*".equals(symbol)) return true;
        return "/".equals(symbol);
    }

    private boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        } catch(NullPointerException e) {
            return false;
        }
        return true;
    }

    private List<String> tokenize(String input) {
        if (input.isEmpty()) {
            return null;
        }
        List <String> tokens = new ArrayList<>();
        return tokens;
    }
}
