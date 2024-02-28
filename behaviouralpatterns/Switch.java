/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behaviouralpatterns;

/**
 *
 * @author dave
 */
//invoker
public class Switch
    {
    public void storeAndExecute(Command command)
        {
        command.execute();
        }
    }
