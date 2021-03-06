/**
 * Description : 
 * Author      : mn@furzoom.com
 * Date        : Oct 20, 2016 9:26:55 AM
 * Copyright (c) 2013-2016, http://furzoom.com All Rights Reserved.
 */

package com.furzoom.lab.algs.ch103;

/**
 * ClassName : E10309 <br>
 * Function : TODO ADD FUNCTION. <br>
 * date : Oct 20, 2016 9:26:55 AM <br>
 * 
 * @version
 */
public class E10309
{
    public static String getCompleteExpression(String exp)
    {
        String[] params = exp.split(" ");
        Stack<String> oprStack = new Stack<String>();
        Stack<String> dataStack = new Stack<String>();
        for (int i = 0; i < params.length; i++) {
            if (isOperator(params[i])) {
                oprStack.push(params[i]);
            } else if (params[i].equals(")")) {
                String d1 = dataStack.pop();
                String d2 = dataStack.pop();
                String op = oprStack.pop();
                dataStack.push("( " + d2 + " " + op + " "+ d1 + " )");
            } else {
                dataStack.push(params[i]);
            }
        }
        return dataStack.pop();
    }
   
    public static void main(String[] args)
    {
        String expression = "1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )";
        String result = getCompleteExpression(expression);
        System.out.println(result);
    }
    
    private static boolean isOperator(String s)
    {
        return (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"));
    }
 
}
