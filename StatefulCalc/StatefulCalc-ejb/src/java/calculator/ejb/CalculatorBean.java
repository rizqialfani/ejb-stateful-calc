/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.ejb;

import javax.ejb.Stateful;

/**
 *
 * @author Mr-Al
 */
@Stateful
public class CalculatorBean implements CalculatorBeanLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Override
    public double add(double addend1, double addend2) {
        return addend1 + addend2;
    }
    @Override
    public double subtract(double minuend, double subtrahend) {
        return minuend - subtrahend;
    }
    @Override
    public double multiply(double factor1, double factor2) {
        return factor1 * factor2;
    }
    @Override
    public double divide(double dividend, double divisor) {
        return dividend / divisor;
    }    
}
