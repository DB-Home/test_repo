/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behaviouralpatterns;

import java.io.Serializable;

/**
 *
 * @author dave
 */
//originator
public class Employee
    {
    private String name;
    private String address;
    private String phone;

    public String getName()
        {
        return name;
        }

    public void setName(String name)
        {
        this.name = name;
        }

    public String getAddress()
        {
        return address;
        }

    public void setAddress(String address)
        {
        this.address = address;
        }

    public String getPhone()
        {
        return phone;
        }

    public void setPhone(String phone)
        {
        this.phone = phone;
        }
    
    public EmployeeMomento save()
        {
        return new EmployeeMomento(name, phone);
        }
    
    public void revert(EmployeeMomento emp)
        {
        this.name = emp.getName();
        this.phone = emp.getPhone();
        }
    
    public String toString()
        {
        return new String(name + " : " + phone);
        }
    }
