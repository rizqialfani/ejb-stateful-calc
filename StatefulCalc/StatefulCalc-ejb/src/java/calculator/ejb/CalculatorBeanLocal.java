/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.ejb;

import javax.ejb.Local;

/**
 *
 * @author Mr-Al
 */
@Local
public interface CalculatorBeanLocal {
     public double isiNilai (double nilai2);
     public double tambah (double nilai2);
     public double kurang (double nilai2);    
     public double kali (double nilai2);    
     public double bagi (double nilai2);
     public double ambilNilai();
     public double reset();
}
