/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBean;

import javax.ejb.Stateless;

/**
 *
 * @author ANDRES CASCAVITA
 */
@Stateless
public class calbean implements calbeanLocal {

    @Override
    public Integer addition(int a, int b) {
        return a+b;
    }

    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public Integer restar(int a, int b) {
        return a-b;
    }

    @Override
    public Integer multiplicar(int a, int b) {
        return a*b;
    }
    
    @Override
    public Integer modulo(int a, int b) {
        return a%b;
    }

    @Override
    public Integer cuadrado(int a) {
        
        return a*a;
    }

    @Override
    public Integer dividir(int a, int b) {
        return a/b;
    }

    
    
    
    
}
