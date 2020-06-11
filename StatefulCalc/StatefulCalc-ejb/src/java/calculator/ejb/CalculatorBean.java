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
    private double nilai = 0;
    
    @Override    
    public double isiNilai(double nilai2) {        
        nilai = nilai2;
        return nilai;
    }
    @Override
    public double tambah(double nilai2){
        nilai += nilai2;
        return nilai;
    }
    @Override   
    public double kurang(double nilai2) {        
        nilai -= nilai2;
        return nilai;
    }    
    @Override    
    public double kali(double nilai2) {        
        nilai *= nilai2;
        return nilai;
    }    
    @Override    
    public double bagi(double nilai2) {        
        nilai /= nilai2;
        return nilai;    
    }
    @Override
    public double ambilNilai(){
        return nilai;
    }

    @Override
    public double reset(){
        double nilai2 = 0;
        return nilai2;
    }
}
