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
//Momento
public class EmployeeMomento
    {
    private String name;
    private String phone;
    
    public EmployeeMomento(String name, String phone)
        {
        this.name = name;
        this.phone = phone;
        }

    public String getName()
        {
        return name;
        }

    public String getPhone()
        {
        return phone;
        }
    
    
    }
