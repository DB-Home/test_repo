/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behaviouralpatterns;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author dave
 */
public class MessageStream extends Subject
    {
    private Deque<String> messageHistory = new ArrayDeque<String>();
    
    @Override
    void setState(String message)
        {
        messageHistory.add(message);
        this.notifyObservers();
        }

    @Override
    String getState()
        {
        return messageHistory.getLast();
        }
    
    }
