/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behaviouralpatterns;

import java.util.Stack;

/**
 *
 * @author dave
 */
//caretaker
public class Caretaker
    {
    private Stack<EmployeeMomento> employeeHistory = new Stack<>();
    
    public void save(Employee emp)
        {
        employeeHistory.push(emp.save());
        }
    
    public void revert(Employee emp)
        {
        emp.revert(employeeHistory.pop());
        }
    }
