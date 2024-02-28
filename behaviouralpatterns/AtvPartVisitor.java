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
public interface AtvPartVisitor
    {
    void visit(Wheel wheel);
    void visit(Fender fender);
    void visit(Oil oil);
    void visit(PartsOrder parsOrder);
    }
