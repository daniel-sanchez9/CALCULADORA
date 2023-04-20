/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBean;

import javax.ejb.Local;

/**
 *
 * @author ANDRES CASCAVITA
 */
@Local
public interface calbeanLocal {

    Integer addition(int a, int b);

    Integer restar(int a, int b);

    Integer multiplicar(int a, int b);

    Integer modulo(int a, int b);

    /**
     *
     * @param a
     * @return
     */
    Integer cuadrado(int a);

    Integer dividir(int a, int b);

    
}
