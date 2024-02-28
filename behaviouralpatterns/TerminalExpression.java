/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behaviouralpatterns;

import java.util.StringTokenizer;
/**
 *
 * @author dave
 */
public class TerminalExpression implements Expression
    {
    private String data;
    
    public TerminalExpression(String data)
        {
        this.data = data;
        }
    
    public boolean interpret(String str)
        {
        StringTokenizer st = new StringTokenizer(str);
        while(st.hasMoreTokens())
            {
            String test = st.nextToken();
            if(test.equalsIgnoreCase(test))
                return true;
            }
        return false;
        }
    }
